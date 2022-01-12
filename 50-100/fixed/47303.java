public java.lang.String removeExtraSpacesEmail(java.lang.String email) {
    java.lang.StringBuilder email_sb = new java.lang.StringBuilder();
    if (email != null) {
        if ((email.length()) > 0) {
            for (char letter : email.toCharArray()) {
                if (letter != ' ') {
                    email_sb.append(letter);
                }
            }
            return email_sb.toString();
        }
    }
    return null;
}