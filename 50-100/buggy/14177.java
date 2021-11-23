protected void runWithDialog(final java.lang.Runnable runnable) {
    final android.app.ProgressDialog pd = com.todoroo.andlib.utility.DialogUtilities.progressDialog(this, getString(R.string.DLG_please_wait));
    new java.lang.Thread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            try {
                runnable.run();
            } catch (java.lang.Exception e) {
                com.todoroo.andlib.utility.DialogUtilities.okDialog(com.todoroo.astrid.core.OldTaskPreferences.this, getString(R.string.DLG_error, e.toString()), null);
            } finally {
                com.todoroo.andlib.utility.DialogUtilities.dismissDialog(com.todoroo.astrid.core.OldTaskPreferences.this, pd);
            }
        }
    }).start();
}