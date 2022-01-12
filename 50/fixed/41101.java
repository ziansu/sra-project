public static boolean hasGetter(final java.lang.String name, final java.lang.String type, final java.lang.String code) {
    return code.contains((((("public " + type) + " get") + (com.spectralogic.ds3autogen.java.helpers.JavaHelper.capFirst(name))) + "()"));
}