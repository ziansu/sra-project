@java.lang.SuppressWarnings(value = "unchecked")
public java.util.List<com.kloudtek.ktserializer.Serializable> readObjectList(com.kloudtek.ktserializer.ClassMapper classMapper) throws com.kloudtek.ktserializer.InvalidSerializedDataException, java.io.IOException {
    return new java.util.ArrayList<com.kloudtek.ktserializer.Serializable>(((com.kloudtek.ktserializer.SerializableList) (readObject(classMapper, com.kloudtek.ktserializer.SerializableList.class))));
}