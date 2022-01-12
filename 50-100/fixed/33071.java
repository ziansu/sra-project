@java.lang.Override
public void scrollTo(com.taobao.weex.ui.component.WXComponent component, int offset) {
    int viewYInScroller = (component.getAbsoluteY()) - (getAbsoluteY());
    int viewXInScroller = (component.getAbsoluteX()) - (getAbsoluteX());
    scrollBy(((viewXInScroller - (getScrollX())) + offset), ((viewYInScroller - (getScrollY())) + offset));
}