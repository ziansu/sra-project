public void setArrayData(java.lang.Object value) {
    info.ata4.unity.rtti.FieldNode arrayField = getChild("Array");
    if (arrayField == null) {
        arrayField = this;
    }
    info.ata4.unity.rtti.FieldNode dataField = arrayField.getChild("data");
    if (dataField == null) {
        throw new info.ata4.unity.rtti.RuntimeTypeException("Field is not an array");
    }
    dataField.setValue(value);
    java.nio.ByteBuffer buffer = ((java.nio.ByteBuffer) (value));
    arrayField.setChildValue("size", buffer.limit());
}