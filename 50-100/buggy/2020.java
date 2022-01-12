public static boolean isValidDetailLevel(java.lang.String dtString) {
    java.lang.Boolean isValid = false;
    if (dtString.equalsIgnoreCase("verbose"))
        isValid = true;
    else
        if (dtString.equalsIgnoreCase("terse"))
            isValid = true;
        else
            if (dtString.equalsIgnoreCase("off"))
                isValid = true;
            
        
    
    return isValid;
}