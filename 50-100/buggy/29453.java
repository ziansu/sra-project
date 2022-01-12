private int getScale() {
    int width = android.content.res.Resources.getSystem().getDisplayMetrics().widthPixels;
    int height = android.content.res.Resources.getSystem().getDisplayMetrics().heightPixels;
    int valW = (this.s_width) / width;
    valW = valW * 100;
    int valH = (this.s_height) / height;
    valH = valH * 100;
    int val = java.lang.Math.min(valW, valH);
    return val;
}