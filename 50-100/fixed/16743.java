public static java.lang.CharSequence noTrailingwhiteLines(java.lang.CharSequence text) {
    if ((text.length()) >= 0) {
        try {
            while ((text.charAt(((text.length()) - 1))) == '\n') {
                text = text.subSequence(0, ((text.length()) - 1));
            } 
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
    return text;
}