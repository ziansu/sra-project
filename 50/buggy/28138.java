public void onDestroy() {
    super.onDestroy();
    if ((isFinishing()) && ((this.patternDetector) != null)) {
        android.util.Log.d("destroy", "destroy");
    }
}