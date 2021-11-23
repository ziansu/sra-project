public void setDimensions() {
    if ((words.length()) <= 20) {
        width = words.replace("\"", "").length();
        height = 1;
    }else {
        width = 20;
        height = ((words.length()) / 20) + 1;
    }
}