@java.lang.Override
public void destroyItem(android.view.ViewGroup container, int position, java.lang.Object object) {
    V pagerView = ((V) (object));
    currentViews.remove(pagerView);
    container.removeView(pagerView);
    if (!(pagerPool.release(pagerView))) {
        com.prolificinteractive.materialcalendarview.CalendarUtils.loge((("recycle (" + (pagerView.getFirstViewDay())) + ") to pool failed, pool's size is to small"));
    }
}