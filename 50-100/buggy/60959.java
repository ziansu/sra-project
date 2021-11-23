public static com.brightcove.commons.catalog.objects.enumerations.GeoFilterCodeEnum lookupByName(java.lang.String name) {
    java.lang.String upperName = name.toUpperCase();
    for (com.brightcove.commons.catalog.objects.enumerations.GeoFilterCodeEnum code : java.util.EnumSet.allOf(com.brightcove.commons.catalog.objects.enumerations.GeoFilterCodeEnum.class)) {
        if (code.name.equals(upperName)) {
            return code;
        }
    }
    return null;
}