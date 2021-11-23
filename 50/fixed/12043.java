public static java.lang.String color(java.lang.String str) {
    if (str.trim().isEmpty()) {
        return str;
    }
    return com.jroossien.boxx.util.Str.COLOR.matcher(str).replaceAll("§$1");
}