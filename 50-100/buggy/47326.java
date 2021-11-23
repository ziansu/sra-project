private void stopRunningLongTask() {
    android.util.Log.e("TAG", "Stop long task...");
    counterRunningTasks.onNext(((counterRunningTasks.getValue()) - 1));
    (counterLongRunningTask)--;
    if ((counterLongRunningTask) == 0) {
        progressLong.setVisibility(View.GONE);
    }
}