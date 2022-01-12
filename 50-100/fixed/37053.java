public com.alibaba.fastjson.JSONArray inViewBubbleList() {
    final int length = mPositionCache.size();
    com.alibaba.fastjson.JSONArray result = new com.alibaba.fastjson.JSONArray(mPositionCache.size());
    for (int i = 0; i < length; i++) {
        result.add(mPositionCache.get(i).getViewIndex());
    }
    return result;
}