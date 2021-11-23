public static boolean isType(java.lang.String test) {
    for (com.beehyv.nmsreporting.enums.AccessType type : com.beehyv.nmsreporting.enums.AccessType.values()) {
        return type.name().equalsIgnoreCase(test);
    }
    return false;
}