private boolean acceptYYYY_MM(java.lang.Object s) {
    java.util.regex.Matcher m = ptYYYY_MM.matcher(s.toString());
    if (m.matches()) {
        try {
            int mm = java.lang.Integer.parseInt(m.group(2));
            return (mm >= 1) && (mm <= 12);
        } catch (java.lang.NumberFormatException e) {
            return false;
        }
    }
    return false;
}