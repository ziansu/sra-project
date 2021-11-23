public static java.lang.String readSystemProp(java.lang.String prop) {
    return com.emman.tame.utils.Utils.CMD(false, ("getprop " + prop));
}