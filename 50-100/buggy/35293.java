private int[] loadStyleList(android.content.Context context, int resId) {
    android.content.res.TypedArray array = context.getResources().obtainTypedArray(resId);
    int[] result = new int[array.length()];
    for (int i = 0; i < (result.length); i++)
        result[i] = array.getResourceId(i, 0);
    
    array.recycle();
    return result;
}