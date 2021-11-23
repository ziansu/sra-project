private java.lang.String padLeftWithZeros(java.lang.String str, int n) {
    if ((str.length()) > n)
        return str.substring(0, (n - 1));
    
    if ((str.length()) == n)
        return str;
    
    return java.lang.String.format((("%0" + (n - (str.length()))) + "d%s"), 0, str);
}