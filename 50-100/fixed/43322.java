public static android.graphics.Rect whatAreMyDims(int row, int col) {
    android.graphics.Rect ret = new android.graphics.Rect();
    ret.top = row * 128;
    ret.left = col * 128;
    ret.bottom = (ret.top) + 128;
    ret.right = (ret.left) + 128;
    return ret;
}