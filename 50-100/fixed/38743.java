@java.lang.Override
public void run() {
    android.util.Log.d("BF", "Calling dismiss of waiting dialog");
    if ((waitingDialog) != null) {
        waitingDialog.closeDialogRequest();
        waitingDialog = null;
    }
    if ((waiting) != null) {
        at.searles.fractview.BitmapFragment.ProgressDialogValues tmp = waiting;
        waiting = null;
        doImageAction(tmp);
    }
    ((at.searles.fractview.BitmapFragment.UpdateListener) (getActivity())).calculationFinished(ms, this);
}