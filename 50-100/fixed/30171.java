@java.lang.Override
public void destroyItem(android.view.ViewGroup container, int position, java.lang.Object object) {
    com.junhzhan.cal.widget.CalendarViewEfficient view = mViewMap.get(object);
    view.resetData();
    container.removeView(mViewMap.get(object));
    mViewMap.remove(object);
}