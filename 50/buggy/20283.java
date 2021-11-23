@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    if ((iabHelper) != null) {
        iabHelper.dispose();
    }
    iabHelper = null;
}