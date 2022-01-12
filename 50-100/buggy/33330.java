public static boolean isDoubleWidthCharacter(char c, boolean ambiguousIsDWC) {
    if (((c == (com.jediterm.terminal.util.CharUtils.DWC)) || (c <= 160)) || ((c > 1106) && (c < 4352))) {
        return false;
    }
    return (com.jediterm.terminal.util.CharUtils.mk_wcwidth(c, ambiguousIsDWC)) == 2;
}