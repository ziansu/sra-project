public static java.lang.String getHashedText(java.lang.String text) throws java.security.NoSuchAlgorithmException {
    java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
    byte[] encodedPassword = md.digest(text.getBytes());
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    for (byte anEncodedPassword : encodedPassword)
        sb.append(java.lang.Integer.toString(((anEncodedPassword & 255) + 256), 16).substring(1));
    
    return sb.toString();
}