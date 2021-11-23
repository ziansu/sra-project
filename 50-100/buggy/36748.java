public <S extends com.kloudtek.ktserializer.Serializable> S deserialize(@org.jetbrains.annotations.NotNull
S serializableObj, @org.jetbrains.annotations.NotNull
byte[] serializedData) throws com.kloudtek.ktserializer.InvalidSerializedDataException {
    try {
        com.kloudtek.ktserializer.DeserializationStream ds = new com.kloudtek.ktserializer.DeserializationStream(serializedData, this);
        return ds.readObject(serializableObj, false);
    } catch (java.io.IOException e) {
        throw new com.kloudtek.ktserializer.InvalidSerializedDataException(e);
    }
}