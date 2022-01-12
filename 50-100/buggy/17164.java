public static java.lang.String truncate(java.lang.String s, int length) {
    com.jcwhatever.nucleus.utils.PreCon.notNull(s);
    com.jcwhatever.nucleus.utils.PreCon.positiveNumber(length);
    com.jcwhatever.nucleus.utils.PreCon.lessThan(length, s.length());
    if ((s.length()) > length)
        return s.substring(0, (length - 1));
    
    return s;
}