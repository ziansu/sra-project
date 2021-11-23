public static pw.phylame.ycl.value.Pair<java.lang.Integer, java.lang.Integer> split(@lombok.NonNull
java.lang.String path) {
    int extpos = path.length();
    int seppos;
    char ch;
    for (seppos = extpos - 1; seppos >= 0; --seppos) {
        ch = path.charAt(seppos);
        if (ch == '.') {
            extpos = seppos;
        }else
            if ((ch == '/') || (ch == '\\')) {
                break;
            }
        
    }
    return new pw.phylame.ycl.value.Pair(seppos, extpos);
}