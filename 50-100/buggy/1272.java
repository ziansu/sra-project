private android.view.View loadViewInternal(com.angcyo.uiview.view.IView iView, com.angcyo.uiview.container.UIParam uiParam) {
    final android.view.View view = iView.inflateContentView(mLayoutActivity, this, this, android.view.LayoutInflater.from(mLayoutActivity));
    android.view.View rawView;
    if ((this) == view) {
        rawView = getChildAt(((getChildCount()) - 1));
    }else {
        rawView = view;
    }
    iView.onViewCreate(view);
    iView.onViewCreate(view, uiParam);
    return rawView;
}