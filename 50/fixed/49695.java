@java.lang.Override
public void onStop() {
    if ((this.currentTask) != null) {
        android.util.Log.d("actuseries", "cancelling recup banniere");
        this.currentTask.cancel(true);
        this.currentTask = null;
    }
    super.onPause();
}