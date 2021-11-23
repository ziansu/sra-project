private static int checkSum(java.lang.String zip) {
    int checkDigit = 0;
    for (int i = 0; i < (zip.length()); i++) {
        checkDigit += java.lang.Integer.parseInt(("" + (zip.charAt(i))));
    }
    checkDigit = checkDigit % 10;
    return checkDigit;
}