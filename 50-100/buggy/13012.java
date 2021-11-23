public static java.util.List<java.lang.String> decolorize(java.util.List<java.lang.String> colored) {
    if (colored == null)
        return null;
    
    java.util.List<java.lang.String> decolored = new java.util.ArrayList<java.lang.String>(colored.size());
    for (java.lang.String string : decolored) {
        decolored.add(com.nisovin.shopkeepers.Utils.translateColorCodesToAlternative('&', string));
    }
    return decolored;
}