private static void putIntegerAsStringWithDefault(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String key, java.lang.Object value, java.lang.Integer defaultValue) {
    if (value instanceof org.verapdf.features.pb.objects.COSInteger) {
        map.put(key, java.lang.String.valueOf(((org.verapdf.features.pb.objects.COSInteger) (value)).intValue()));
    }else {
        if (!(defaultValue == null)) {
            map.put(key, defaultValue.toString());
        }
    }
}