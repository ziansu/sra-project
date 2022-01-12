public static java.lang.String getSuffixName(java.lang.String number) {
    if (number.matches(".*E.*E.*"))
        return "";
    
    java.lang.String result = com.llamacorp.equate.SISuffixHelper.mSISuffixMap.get(number.substring(number.indexOf("E")));
    if (result != null)
        return result;
    else
        return "";
    
}