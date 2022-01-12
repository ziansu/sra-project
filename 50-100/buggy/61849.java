public void setColors(int... colors) {
    linearGradient = null;
    if ((orientation) == (com.duan.colorpicker.ColorPickerView.Orientation.HORIZONTAL)) {
        linearGradient = new android.graphics.LinearGradient(rect.left, rect.top, rect.right, rect.top, colors, null, Shader.TileMode.CLAMP);
    }else {
        linearGradient = new android.graphics.LinearGradient(rect.left, rect.top, rect.left, rect.bottom, colors, null, Shader.TileMode.CLAMP);
    }
    needReDrawColorTable = true;
    invalidate();
}