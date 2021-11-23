private boolean isNoisyName(java.lang.String name) {
    if ((noisyNames) == null) {
        noisyNames = new java.util.HashSet<java.lang.String>();
        for (java.lang.String s : noise)
            noisyNames.add(s);
        
    }
    return noisyNames.contains(name.toLowerCase());
}