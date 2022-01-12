public static int getDisplayHeightValue(int designHeightValue) {
    return java.lang.Math.round(((((float) (designHeightValue)) * (com.zjl.autolayout.AutoUtils.displayHeight)) / (com.zjl.autolayout.AutoUtils.designHeight)));
}