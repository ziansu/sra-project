public static boolean isWordSeparate(java.lang.String before, java.lang.String after) {
    if ((before.length()) == 0) {
        return false;
    }
    if ((after.length()) == 0) {
        return false;
    }
    return (org.xmlsmartdoc.SmartDoc.USmartDoc.isWordSeparateLang(before.charAt(((before.length()) - 1)))) && (org.xmlsmartdoc.SmartDoc.USmartDoc.isWordSeparateLang(before.charAt(0)));
}