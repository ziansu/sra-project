@java.lang.Override
public void run() {
    android.util.Log.d("BF", "Calling dismiss of waiting dialog");
    if ((waiting) != null) {
        waitingDialog.closeDialogRequest();
        at.searles.fractview.BitmapFragment.ProgressDialogValues tmp = waiting;
        waiting = null;
        doImageAction(tmp);
    }
    ((at.searles.fractview.BitmapFragment.UpdateListener) (getActivity())).calculationFinished(ms, this);
}