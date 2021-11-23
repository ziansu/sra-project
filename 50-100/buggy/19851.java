public static void main(java.lang.String[] args) {
    logger.debug("Hello World GitHub - Master Updated Again!");
    java.lang.String str = "Hello World";
    java.lang.String anotherString = "hello world";
    java.lang.Object objStr = str;
    java.lang.System.out.println(str.compareTo(anotherString));
    java.lang.System.out.println(str.compareToIgnoreCase(anotherString));
    java.lang.System.out.println(str.compareTo(objStr.toString()));
}