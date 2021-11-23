public void cancel(android.view.View view) {
    if ((ph.intrepidstream.callmanager.util.PreferenceManager.getInstance(this).getCountry()) != (ph.intrepidstream.callmanager.util.Country.NONE)) {
        setResult(ph.intrepidstream.callmanager.ui.RESULT_CANCELED);
        finish();
    }
}