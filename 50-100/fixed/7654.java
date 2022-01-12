public static java.lang.String getProperty(java.lang.String s) {
    java.lang.String value;
    switch (s) {
        case "java.class.path" :
            value = ".";
            break;
        default :
            value = java.lang.System.getProperty(s);
            break;
    }
    java.lang.System.out.printf("GetSystemProp %s = %s\n", s, value);
    return value;
}