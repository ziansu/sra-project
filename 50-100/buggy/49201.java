private void updateTypeInfo(com.hortonworks.streamline.streams.catalog.UDFInfo udfInfo, java.lang.Class<?> clazz) {
    if (udfInfo.isAggregate()) {
        udfInfo.setReturnType(getReturnType(clazz, "result"));
        udfInfo.setArgTypes(getArgTypes(clazz, "add"));
    }else {
        udfInfo.setReturnType(getReturnType(clazz, "evaluate"));
        udfInfo.setArgTypes(getArgTypes(clazz, "evaluate"));
    }
}