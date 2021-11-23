private void setDimensions() {
    if ((java.lang.Double.toString(value).length()) < 15) {
        width = java.lang.Double.toString(value).length();
        height = 1;
    }else {
        width = 15;
        height = ((java.lang.Double.toString(value).length()) / (width)) + 1;
    }
}