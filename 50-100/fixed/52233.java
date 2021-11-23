public void setHasActionBarSpinner(java.lang.Boolean hasActionBarSpinner) {
    android.support.v7.app.ActionBar actionBar = getSupportActionBar();
    if (actionBar != null) {
        android.widget.Spinner spinner = ((android.widget.Spinner) (findViewById(R.id.spinner_nav)));
        if (hasActionBarSpinner) {
            if (spinner != null)
                spinner.setVisibility(View.VISIBLE);
            
            actionBar.setDisplayShowTitleEnabled(false);
        }else {
            if (spinner != null)
                spinner.setVisibility(View.GONE);
            
            actionBar.setDisplayShowTitleEnabled(true);
        }
        mHasActionBarSpinner = hasActionBarSpinner;
    }
}