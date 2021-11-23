public java.lang.Integer addDigitsInString(java.lang.String text) {
    if (org.apache.commons.lang3.StringUtils.isNotEmpty(text)) {
        java.lang.String[] arrNumbers = text.replaceAll("\\D+", " ").trim().split(" ");
        int sum = 0;
        for (java.lang.String strNumber : arrNumbers) {
            sum += java.lang.Integer.parseInt(strNumber);
        }
        return sum;
    }
    return 0;
}