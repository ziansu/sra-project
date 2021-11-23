@java.lang.Override
public void scrollTo(com.taobao.weex.ui.component.WXComponent component, int offset) {
    int offsetIntF = ((int) (com.taobao.weex.utils.WXViewUtils.getRealPxByWidth(offset)));
    int viewYInScroller = (component.getAbsoluteY()) - (getAbsoluteY());
    int viewXInScroller = (component.getAbsoluteX()) - (getAbsoluteX());
    scrollBy(((viewXInScroller - (getScrollX())) + offsetIntF), ((viewYInScroller - (getScrollY())) + offsetIntF));
}