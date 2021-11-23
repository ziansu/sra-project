protected java.lang.String getTrimmedStringValue(java.lang.String value) {
    int sInd = 0;
    for (int i = 0; i < ((value.length()) - 1); i++) {
        if (((value.charAt(i)) == '0') && ((value.charAt((i + 1))) != '.')) {
            sInd = i + 1;
            break;
        }
    }
    java.lang.String res = value.substring(sInd);
    return res;
}