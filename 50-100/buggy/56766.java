private java.lang.String reverseString(java.lang.String inStr) {
    java.lang.String outStr = "";
    if ((inStr != null) && (!(inStr.equals("")))) {
        for (int i = inStr.length(); i > (-1); i--) {
            outStr += inStr.charAt(i);
        }
    }
    return outStr;
}