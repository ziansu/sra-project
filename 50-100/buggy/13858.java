private int[] getStyleList(int styleId) {
    int[] list = mStyles.get(styleId);
    if (list == null) {
        list = loadStyleList(mContext, styleId);
        mStyles.put(styleId, list);
    }
    return list;
}