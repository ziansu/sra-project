public static java.lang.CharSequence trimSpanned(final android.text.Spanned source) {
    final int length = source.length();
    int i = length;
    while (((--i) >= 0) && (java.lang.Character.isWhitespace(source.charAt(i)))) {
    } 
    if (i < (length - 1)) {
        return source.subSequence(0, (i + 1));
    }
    return source;
}