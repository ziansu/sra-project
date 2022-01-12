public java.lang.String arrayToString(java.lang.Object[] array) {
    java.lang.StringBuffer buffer = new java.lang.StringBuffer();
    for (int i = 0; i < (array.length); i++) {
        if (i > 0) {
            buffer.append(dk.lessismore.nojpa.reflection.attributeconverters.AttributeConverter.arraySeparator);
        }
        buffer.append(objectToString(array[i]));
    }
    return buffer.toString();
}