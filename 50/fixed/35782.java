@java.lang.Override
public void onDestroy() {
    if ((((rootView) != null) && (rootView.getViewTreeObserver())) && ((list) != null)) {
        rootView.getViewTreeObserver().removeOnGlobalLayoutListener(list);
    }
}