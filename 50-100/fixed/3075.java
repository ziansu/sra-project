java.lang.String generateDirectory() {
    java.lang.String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmn1234567890";
    java.lang.StringBuilder salt = new java.lang.StringBuilder();
    java.util.Random rnd = new java.util.Random();
    while ((salt.length()) < (tdl.auth.linkgenerator.Page.KEY_LENGTH)) {
        int index = ((int) ((rnd.nextFloat()) * (SALTCHARS.length())));
        salt.append(SALTCHARS.charAt(index));
    } 
    return salt.toString();
}