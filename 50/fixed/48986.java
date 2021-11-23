private static void showMsg(android.view.View targetView, int strId) {
    android.support.design.widget.Snackbar.make(targetView, strId, Snackbar.LENGTH_SHORT).show();
}