private static java.lang.String getFortyCharactersOfList(javax.mail.Address[] array) {
    java.lang.StringBuffer sb = new java.lang.StringBuffer();
    for (int i = 0; i < (array.length); i++) {
        sb.append(array[i].toString());
        sb.append(" ");
    }
    if ((sb.length()) > 40) {
        return sb.substring(0, 40);
    }else {
        return sb.toString();
    }
}