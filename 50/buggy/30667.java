@java.lang.Override
public void run() {
    setResultViewData(payResult);
    scrollView.fullScroll(View.FOCUS_DOWN);
    dismissProgressBar();
}