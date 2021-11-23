private static void putBooleanAsStringWithDefault(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String key, java.lang.Object value, java.lang.Boolean defaultValue) {
    if (value instanceof org.verapdf.features.pb.objects.COSBoolean) {
        map.put(key, java.lang.String.valueOf(((org.verapdf.features.pb.objects.COSBoolean) (value)).getValue()));
    }else {
        if (defaultValue != null) {
            map.put(key, defaultValue.toString());
        }
    }
}