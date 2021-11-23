public android.view.ViewGroup getInnerView() {
    if ((mHost) == null)
        return null;
    
    if ((mHost) instanceof com.taobao.weex.ui.view.refresh.wrapper.BounceScrollerView) {
        return ((com.taobao.weex.ui.view.refresh.wrapper.BounceScrollerView) (mHost)).getInnerView();
    }else {
        return getHostView();
    }
}