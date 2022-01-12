public petrov.kristiyan.colorpicker.ColorPicker setColors(int resId) {
    ta = context.getResources().obtainTypedArray(resId);
    colors = new java.util.ArrayList<>();
    for (int i = 0; i < (ta.length()); i++) {
        colors.add(new petrov.kristiyan.colorpicker.ColorPal(ta.getColor(i, 0), false));
    }
    return this;
}