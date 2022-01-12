@java.lang.Override
protected void onProgressUpdate(java.lang.Integer[] values) {
    int progress = values[0];
    progressBar.setProgerss(progress, true);
    if (progress >= 100) {
        android.util.Log.d("zzzzz", "开始播放 ");
        play(videoFile.getAbsolutePath());
    }
}