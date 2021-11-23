private void startProcessDialog() {
    pDialog.setTitle("Loading map");
    pDialog.setMessage("Please wait...");
    try {
        pDialog.show();
    } catch (android.view.WindowManager e) {
        com.gmail.mkounal.places.Enviroment.Logging.log(Logging.enumLoggingLevel.e, TAG, "activity is not running");
    }
}