public static java.lang.String getProperty(java.lang.String s) {
    java.lang.String value;
    switch (s) {
        case "user.home" :
            value = org.parabot.core.Directories.getCachePath().getAbsolutePath();
            break;
        case "java.class.path" :
            value = ".";
            break;
        default :
            value = java.lang.System.getProperty(s);
    }
    java.lang.System.out.printf("GetSystemProp %s = %s\n", s, value);
    return value;
}