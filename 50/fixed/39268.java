@java.lang.Override
protected void onResume() {
    super.onResume();
    resumeTime = java.lang.System.currentTimeMillis();
    if (rc_run_yet) {
        rc.run();
    }
}