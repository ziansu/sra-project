protected java.lang.String getTrimmedStringValue(java.lang.String value) {
    if ((((value.length()) > 1) && ((value.charAt(0)) == '0')) && ((value.charAt(1)) != '.'))
        return value.substring(1);
    
    return value;
}