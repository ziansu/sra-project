public static boolean containsVariable(java.lang.String str, java.lang.String... strings) {
    if ((str != null) && ((str.contains("{")) || (str.contains("}"))))
        return true;
    
    for (java.lang.String str0 : strings)
        if ((str0.contains("{")) || (str0.contains("}")))
            return true;
        
    
    return false;
}