public com.alibaba.fastjson.JSONArray outViewBubbleList() {
    com.alibaba.fastjson.JSONArray result = new com.alibaba.fastjson.JSONArray();
    for (com.alibaba.weex.plugin.gcanvas.bubble.BubbleAnimateWrapper wrapper : mWrapperList) {
        com.alibaba.weex.plugin.gcanvas.bubble.BubblePosition position = wrapper.getPosition();
        if ((null == position) || (position.isNail)) {
            result.add(wrapper.getViewIndex());
        }
    }
    return result;
}