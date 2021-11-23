private java.lang.String addLength(java.lang.String str) {
    int length = (str.length()) + 6;
    if (length < 10) {
        return (("000" + length) + " ") + str;
    }else
        if (length < 100) {
            return (("00" + length) + " ") + str;
        }else {
            return (("0" + length) + " ") + str;
        }
    
}