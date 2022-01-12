public static boolean check(java.lang.String passwd, java.lang.String hashed) {
    java.lang.String salt = hashed.substring(0, jetbrick.util.PasswordUtils.SALT_LENGTH);
    java.lang.String rehashed = jetbrick.util.codec.MD5Utils.md5Hex((salt + passwd));
    return hashed.substring(jetbrick.util.PasswordUtils.SALT_LENGTH).equals(rehashed.substring(jetbrick.util.PasswordUtils.SALT_LENGTH));
}