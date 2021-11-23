private petrov.kristiyan.colorpicker.ColorPicker setColors() {
    ta = context.getResources().obtainTypedArray(R.array.default_colors);
    colors = new java.util.ArrayList<>();
    for (int i = 0; i < (ta.length()); i++) {
        colors.add(new petrov.kristiyan.colorpicker.ColorPal(ta.getColor(i, 0), false));
    }
    return this;
}