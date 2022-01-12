public void onClick(android.view.View view) {
    if ((org.openoverlayrouter.noroot.OOR.oorRunning) == false) {
        java.io.File file = new java.io.File(org.openoverlayrouter.noroot.OOR.conf_file);
        if (!(file.exists())) {
            showMessage(faActivity.getString(R.string.noConfFile), false, null);
        }
        startOOR();
    }else {
        showMessage(faActivity.getString(R.string.askStopServiceString), true, new java.lang.Runnable() {
            public void run() {
                killOOR();
                oorWasRunning = false;
                org.openoverlayrouter.noroot.OOR.oorRunning = false;
            }
        });
    }
}