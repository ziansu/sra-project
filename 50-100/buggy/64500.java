public java.lang.String randomString(int length) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    for (int i = 0; i < length; i++) {
        sb.append(((random.nextInt(('z' - '!'))) + '!'));
    }
    return sb.toString();
}