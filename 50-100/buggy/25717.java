private java.util.Map<java.lang.String, java.lang.Object> translate(java.util.Map<java.lang.String, java.lang.Object> map, com.silicornio.quepotranslator.QPTransObject transObject) {
    java.util.Map<java.lang.String, java.lang.Object> instanceMap = translateToMap(map, transObject);
    com.silicornio.quepotranslator.general.QPL.i(("Map generated: " + (instanceMap.toString())));
    return generateObjects(instanceMap);
}