@java.lang.Override
public void onResult(java.lang.Integer result) {
    int progressPercent = result;
    if ((progressPercent >= 0) && (progressPercent <= 100)) {
        totalProgress.setProgressPercent(progressPercent);
    }
}