public static boolean isDoubleWidthCharacter(int c, boolean ambiguousIsDWC) {
    if (((c == (com.jediterm.terminal.util.CharUtils.DWC)) || (c <= 160)) || ((c > 1106) && (c < 4352))) {
        return false;
    }
    return (com.jediterm.terminal.util.CharUtils.mk_wcwidth(c, ambiguousIsDWC)) == 2;
}