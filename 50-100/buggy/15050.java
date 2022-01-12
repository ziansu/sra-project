public void run() {
    final org.geometerplus.zlibrary.core.view.ZLView view = org.geometerplus.zlibrary.core.application.ZLApplication.Instance().getCurrentView();
    final org.geometerplus.zlibrary.ui.android.view.ZLAndroidPaintContext context = new org.geometerplus.zlibrary.ui.android.view.ZLAndroidPaintContext(mySystemInfo, canvas, new org.geometerplus.zlibrary.ui.android.view.ZLAndroidPaintContext.Geometry(getWidth(), getHeight(), getWidth(), getMainAreaHeight(), 0, 0), (view.isScrollbarShown() ? getVerticalScrollbarWidth() : 0));
    view.preparePage(context, ZLView.PageIndex.next);
}