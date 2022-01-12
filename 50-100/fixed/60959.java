public static com.brightcove.commons.catalog.objects.enumerations.GeoFilterCodeEnum lookupByName(java.lang.String name) {
    if (name == null) {
        return null;
    }
    java.lang.String upperName = name.toUpperCase();
    for (com.brightcove.commons.catalog.objects.enumerations.GeoFilterCodeEnum code : java.util.EnumSet.allOf(com.brightcove.commons.catalog.objects.enumerations.GeoFilterCodeEnum.class)) {
        if (code.name.toUpperCase().equals(upperName)) {
            return code;
        }
    }
    return null;
}