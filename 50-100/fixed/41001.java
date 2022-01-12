private int[] getAccountColorOptions() {
    android.content.res.Resources res = getResources();
    android.content.res.TypedArray colorTypedArray = res.obtainTypedArray(R.array.account_colors);
    int[] colorOptions = new int[colorTypedArray.length()];
    for (int i = 0; i < (colorTypedArray.length()); i++) {
        int color = colorTypedArray.getColor(i, getResources().getColor(R.color.title_green));
        colorOptions[i] = color;
    }
    return colorOptions;
}