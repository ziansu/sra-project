private boolean acceptMM_YYYY(java.lang.String s) {
    java.util.regex.Matcher m = ptMM_YYYY.matcher(s);
    if (m.matches()) {
        try {
            int mm = java.lang.Integer.parseInt(m.group(1));
            return (mm >= 1) && (mm <= 12);
        } catch (java.lang.NumberFormatException e) {
            return false;
        }
    }
    return false;
}