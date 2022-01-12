public static java.lang.String calculator(java.lang.String numStr) {
    int num = java.lang.Integer.parseInt(numStr);
    if (num > 255)
        num = 255;
    else
        if (num < 0)
            num = 0;
        
    
    return java.lang.Integer.toHexString(num).toUpperCase();
}