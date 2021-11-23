public static java.lang.String calculator(java.lang.String numStr) {
    int num = java.lang.Integer.parseInt(numStr);
    if (num > 100)
        num = 100;
    else
        if (num < 0)
            num = 0;
        
    
    return java.lang.Integer.toHexString(((num * 255) / 100)).toUpperCase();
}