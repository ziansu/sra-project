public static java.lang.Integer parseDrinkPrice(java.lang.CharSequence input) {
    try {
        java.lang.String content = input.toString().replaceAll(",", ".").trim();
        double value = java.lang.Double.parseDouble(content);
        if (value == 0) {
            return null;
        }
        return ((int) (java.lang.Math.round((value * 100))));
    } catch (java.lang.Exception e) {
    }
    return null;
}