public static boolean areDouble(java.lang.Object... list) {
    for (java.lang.Object obj : list)
        if (!(obj instanceof java.lang.Double))
            return false;
        
    
    return true;
}