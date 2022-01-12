@java.lang.Override
protected void onStop() {
    super.onStop();
    if ((_shootMP) != null) {
        _shootMP.release();
        _shootMP = null;
    }
}