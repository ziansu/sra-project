private java.lang.String normalize(java.lang.String inStr) {
    java.lang.String str = inStr.trim();
    if (((str.indexOf('-')) != (-1)) && ((str.indexOf(' ')) != (-1))) {
        if (isHyphenIgnored()) {
            str = str.replace('-', ' ');
        }else {
            str = str.replace(" - ", " ");
        }
    }
    return str;
}