private java.lang.Integer parseText(java.lang.String text) {
    int result;
    try {
        if (text.equals("unspecified")) {
            result = -1;
        }else {
            result = java.lang.Integer.parseInt(text);
        }
    } catch (java.lang.NumberFormatException ex) {
        result = (cz.fidentis.featurepoints.FacialPointType.valueOf(text).ordinal()) + 1;
    }
    return result;
}