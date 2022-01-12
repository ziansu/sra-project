@java.lang.Override
public java.lang.String getGsonFieldRepresentationFor(com.nvinayshetty.DTOnator.FieldCreator.AccessModifier accessModifier, java.lang.String key) {
    java.lang.String fieldName;
    if (key.contains("111")) {
        java.lang.String[] values = key.split("111");
        fieldName = values[1];
    }else {
        fieldName = com.nvinayshetty.DTOnator.FieldCreator.FieldRepresentor.suffix(key);
    }
    return com.nvinayshetty.DTOnator.FieldCreator.FieldRepresentor.getGsonAnnotationFor(fieldName).append(getSimpleFieldRepresentationFor(accessModifier, key)).toString();
}