@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    handler.removeCallbacksAndMessages(null);
    handler = null;
    toast.cancel();
    toast = null;
}