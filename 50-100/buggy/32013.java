public void setArrayData(java.lang.Object value) {
    info.ata4.unity.rtti.FieldNode arrayField = getChild("Array");
    if (arrayField == null) {
        info.ata4.unity.rtti.FieldNode dataField = getChild("data");
        if (dataField != null) {
            dataField.setValue(value);
            java.nio.ByteBuffer buffer = ((java.nio.ByteBuffer) (value));
            setChildValue("size", buffer.limit());
            return ;
        }
        throw new info.ata4.unity.rtti.RuntimeTypeException("Field is not an array");
    }
    arrayField.setChildValue("data", value);
}