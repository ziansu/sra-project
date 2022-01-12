public static java.lang.String randomName(int minLength, int maxLength) {
    int length = com.github.feiweima.vendor.domain.RandomUtils.random(minLength, maxLength);
    java.lang.StringBuilder sb = new java.lang.StringBuilder().append(((char) (com.github.feiweima.vendor.domain.RandomUtils.random(65, 90))));
    for (int i = 0; i < (length - 1); i++) {
        sb.append(((char) (com.github.feiweima.vendor.domain.RandomUtils.random(97, 122))));
    }
    return sb.toString();
}