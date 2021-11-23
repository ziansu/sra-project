public static java.lang.String replaceChineseComma(java.lang.String s) {
    if (s != null) {
        return s.replace("，", ",").replace(" ", "");
    }else {
        return s;
    }
}