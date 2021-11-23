public static java.lang.String sanitizeName(java.lang.String name) {
    java.util.regex.Matcher m = edu.ycp.cs.pygmymarmoset.app.controller.ZipUtil.DRIVE_LETTER.matcher(name);
    if (m.find()) {
        name = name.substring(2);
    }
    name = name.replace('\\', '/');
    java.util.regex.Matcher m2 = edu.ycp.cs.pygmymarmoset.app.controller.ZipUtil.LEADING_SLASH.matcher(name);
    if (m2.find()) {
        java.lang.String s = m.group(0);
        name = name.substring(s.length());
    }
    return name;
}