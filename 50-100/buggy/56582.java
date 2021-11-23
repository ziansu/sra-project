public com.fondesa.recyclerviewdivider.RecyclerViewDivider.Builder tint(@android.support.annotation.ColorInt
int color) {
    if (color != (com.fondesa.recyclerviewdivider.RecyclerViewDivider.Builder.INT_DEF)) {
        color = com.fondesa.recyclerviewdivider.RecyclerViewDivider.Builder.INT_DEF;
        android.util.Log.w(com.fondesa.recyclerviewdivider.RecyclerViewDivider.TAG, "tint() will override effects of color()");
    }
    if ((drawable) == null) {
        android.util.Log.w(com.fondesa.recyclerviewdivider.RecyclerViewDivider.TAG, "tint() you haven't used drawable() yet so this method won't have effects");
    }
    tint = color;
    return this;
}