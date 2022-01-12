public void setLinearValueColorPicker(com.github.mata1.simpledroidcolorpicker.pickers.LinearValueColorPicker lcp) {
    mValLCP = lcp;
    mValLCP.setOnColorChangedListener(new com.github.mata1.simpledroidcolorpicker.interfaces.OnColorChangedListener() {
        @java.lang.Override
        public void colorChanged(int color) {
            float value = com.github.mata1.simpledroidcolorpicker.utils.ColorUtils.getValueFromColor(color);
            mValuePaint.setAlpha(((int) ((1 - value) * 255)));
            mHandlePaint.setColor(color);
            invalidate();
        }
    });
}