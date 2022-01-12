public int getRealCurrentItem() {
    int i = super.getCurrentItem();
    return ((com.taobao.weex.ui.view.WXCirclePageAdapter) (getAdapter())).getRealPosition(i);
}