public static int indexOfLastLineX(java.lang.String str, int X) {
    if ((str == null) || (str.isEmpty())) {
        return 0;
    }
    int lines = 1;
    int pos = str.lastIndexOf("\n");
    while ((pos = (str.lastIndexOf("\n", pos)) - 1) != 0) {
        lines++;
        if (lines > X) {
            return pos / 2;
        }
    } 
    return 0;
}