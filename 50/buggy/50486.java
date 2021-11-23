public static int getDisplayWidthValue(int designWidthValue) {
    if (designWidthValue < 2) {
        return designWidthValue;
    }
    return (designWidthValue * (com.zjl.autolayout.AutoUtils.displayWidth)) / (com.zjl.autolayout.AutoUtils.designWidth);
}