private static java.lang.String fixUglyHTML(java.lang.String str) {
    for (java.lang.String regex : me.timothy.wcm.WCMUtils.REGEX_REMOVE_HTML) {
        str = str.replaceAll(regex, "");
    }
    for (java.lang.String[] regexAndRepl : me.timothy.wcm.WCMUtils.REGEX_REPLACE_HTML) {
        str = str.replaceAll(regexAndRepl[0], regexAndRepl[1]);
    }
    return str;
}