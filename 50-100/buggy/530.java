private static java.lang.String randomStr(int len) {
    java.lang.StringBuffer sb = new java.lang.StringBuffer();
    java.util.Random random = new java.util.Random();
    for (int i = 0; i < len; i++) {
        sb.append(com.commons.image.ImageCaptcha.CHAR.charAt(random.nextInt(com.commons.image.ImageCaptcha.CHAR.length())));
    }
    return sb.toString();
}