private void stopRunningLongTask() {
    android.util.Log.e("TAG", "Stop long task...");
    counterRunningTasks.onNext(((counterRunningTasks.getValue()) - 1));
    (counterLongRunningTask)--;
    if ((counterLongRunningTask) == 0) {
        if ((progressLong) != null) {
            progressLong.setVisibility(View.GONE);
        }
    }
}