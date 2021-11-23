public int removeZero(java.lang.String tall) {
    if ((tall.charAt(0)) == '0') {
        return java.lang.Character.getNumericValue(tall.charAt(1));
    }
    return java.lang.Integer.parseInt(tall);
}