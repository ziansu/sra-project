@java.lang.Override
public com.parse.ParseFieldOperation decode(android.os.Parcel source, com.parse.ParseParcelDecoder decoder) {
    int size = source.readInt();
    java.util.List<java.lang.Object> list = new java.util.ArrayList<>(size);
    for (int i = 0; i < size; i++) {
        list.set(i, decoder.decode(source));
    }
    return new com.parse.ParseAddOperation(list);
}