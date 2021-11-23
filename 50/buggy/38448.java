@java.lang.Override
protected void onPreExecute() {
    android.support.design.widget.Snackbar.make(mRootView, "Finished task, saving...", Snackbar.LENGTH_INDEFINITE).show();
    if ((!(mIsStepSaved)) || (!(mInEditMode))) {
        saveStep(findViewById(R.id.save_step_option_button));
    }
}