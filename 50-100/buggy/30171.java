@java.lang.Override
public void destroyItem(android.view.ViewGroup container, int position, java.lang.Object object) {
    android.util.Log.e(com.junhzhan.cal.widget.CalendarWidgetNew.TAG, ("destroyItem " + object));
    com.junhzhan.cal.widget.CalendarViewEfficient view = mViewMap.get(object);
    view.resetData();
    container.removeView(mViewMap.get(object));
    mViewMap.remove(object);
}