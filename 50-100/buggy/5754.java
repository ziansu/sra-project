@java.lang.Override
public void unbindDisappearEvent(com.taobao.weex.ui.component.WXComponent component) {
    java.util.concurrent.ConcurrentHashMap<java.lang.String, com.taobao.weex.ui.component.WXScroller.AppearData> appearMap = mAppearMap.get(getInnerView());
    if (appearMap == null) {
        return ;
    }
    com.taobao.weex.ui.component.WXScroller.AppearData appearData = appearMap.get(component.getRef());
    if (appearData == null) {
        return ;
    }
    appearData.hasDisappear = false;
    if (!(appearData.hasAppear)) {
        appearMap.remove(component.getRef());
    }
}