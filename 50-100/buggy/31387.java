public static com.brightcove.commons.catalog.objects.enumerations.GeoFilterCodeEnum lookupByCode(java.lang.String code) {
    java.lang.String upperCode = code.toUpperCase();
    for (com.brightcove.commons.catalog.objects.enumerations.GeoFilterCodeEnum lookup : java.util.EnumSet.allOf(com.brightcove.commons.catalog.objects.enumerations.GeoFilterCodeEnum.class)) {
        if (lookup.code.equals(upperCode)) {
            return lookup;
        }
    }
    return null;
}