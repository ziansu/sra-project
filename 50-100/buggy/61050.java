public static boolean isEmpty(java.lang.String[] args) {
    if ((args == null) || ((args.length) == 0)) {
        return false;
    }
    for (java.lang.String str : args) {
        if (com.cmy.xcheck.util.StringUtil.isEmpty(str)) {
            return true;
        }
    }
    return false;
}