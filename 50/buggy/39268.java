@java.lang.Override
protected void onResume() {
    super.onResume();
    if (rc_run_yet) {
        rc.run();
    }
    resumeTime = java.lang.System.currentTimeMillis();
}