private void addKeysAndOffsets() throws java.io.IOException {
    map = new java.util.HashMap<K, java.lang.Long>();
    java.io.DataInput input = fileWithKeysAndOffsets;
    int size = input.readInt();
    maxOffset = input.readLong();
    counter = input.readInt();
    for (int i = 0; i < size; i++) {
        map.put(serializerAndDeserializerForKey.deserialize(input), serializerAndDeserializerForOffsets.deserialize(input));
    }
}