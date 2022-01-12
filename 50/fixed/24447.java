public static java.lang.String getRandomStr(int length) {
    java.lang.String str = "";
    for (int i = 0; i < length; i++) {
        str += org.fczm.common.util.MathTool.getRandom(9);
    }
    return str;
}