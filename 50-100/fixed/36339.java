public void setDimensions() {
    if ((words.length()) <= 20) {
        width = words.substring(1, ((words.length()) - 1)).length();
        height = 1;
    }else {
        width = 20;
        height = ((words.length()) / 20) + 1;
    }
}