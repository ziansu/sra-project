public void updatePatientVisitsData(boolean errorOccurred) {
    final java.util.List<android.support.v4.app.Fragment> fragments = getSupportFragmentManager().getFragments();
    for (final android.support.v4.app.Fragment fragment : fragments) {
        if (null != fragment) {
            this.runOnUiThread(new java.lang.Runnable() {
                @java.lang.Override
                public void run() {
                    recreateFragmentView(fragment);
                }
            });
        }
    }
    stopLoader(errorOccurred);
}