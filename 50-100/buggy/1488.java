public static boolean isBlank(java.lang.String str) {
    if (com.xjd.utils.basic.StringUtils.isEmpty(str))
        return true;
    
    for (int i = 0, len = str.length(); i < len; i++) {
        if ((str.charAt(i)) != ' ') {
            return false;
        }
    }
    return true;
}