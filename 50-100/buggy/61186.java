@java.lang.Override
protected android.app.Dialog onCreateDialog(int id) {
    switch (id) {
        case io.interactionlab.tutorial_mobile_example.MainActivity.progress_bar_type :
            progrssDialog = new android.app.ProgressDialog(this);
            progrssDialog.setMessage("Downloading model. Please wait...");
            progrssDialog.setIndeterminate(false);
            progrssDialog.setMax(100);
            progrssDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
            progrssDialog.setCancelable(true);
            progrssDialog.show();
            return progrssDialog;
        default :
            return null;
    }
}