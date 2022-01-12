@java.lang.Override
public void run() {
    if ((getInnerView()) == null) {
        return ;
    }
    if ((mOrientation) == (VERTICAL)) {
        ((com.taobao.weex.ui.view.WXScrollView) (getInnerView())).smoothScrollBy(0, y);
    }else {
        ((com.taobao.weex.ui.view.WXHorizontalScrollView) (getInnerView())).smoothScrollBy(x, 0);
    }
    getInnerView().invalidate();
}