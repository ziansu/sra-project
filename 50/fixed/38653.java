private static java.lang.Class<?> getRetainerClass(java.lang.Class<?> clazz) {
    try {
        return java.lang.Class.forName(((clazz.getName()) + (com.woodblockwithoutco.beretained.BeRetained.FIELDS_RETAINER_SUFFIX)));
    } catch (java.lang.ClassNotFoundException e) {
        return null;
    }
}