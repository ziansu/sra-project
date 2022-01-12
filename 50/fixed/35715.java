public static boolean accepts(java.lang.String type) {
    if (type != null) {
        return org.openhab.binding.loxone.internal.core.LxControlDimmer.TYPE_NAME.equalsIgnoreCase(type);
    }else {
        return false;
    }
}