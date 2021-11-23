@java.lang.Override
public void onClick(android.view.View clickedView) {
    java.lang.Long previousClickTimestamp = lastClickMap.get(clickedView);
    long currentTimestamp = android.os.SystemClock.uptimeMillis();
    lastClickMap.put(clickedView, currentTimestamp);
    if ((previousClickTimestamp == null) || ((currentTimestamp - previousClickTimestamp) > (minimumInterval))) {
        onDeBouncedClick(clickedView);
    }
}