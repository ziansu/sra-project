@java.lang.Override
public void run() {
    dismissProgressBar();
    if (payResult != null) {
        setResultViewData(payResult);
        scrollView.fullScroll(View.FOCUS_DOWN);
    }
}