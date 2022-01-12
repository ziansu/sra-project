private void aboutUs() {
    android.util.Log.i(LOG_TAG, "Displaying AboutUs information...");
    android.support.v7.app.AlertDialog.Builder builder = new android.support.v7.app.AlertDialog.Builder(this);
    android.view.LayoutInflater inflater = android.view.LayoutInflater.from(this);
    android.view.View viewRoot = inflater.inflate(R.layout.about_us, null);
    builder.setTitle("About Us");
    builder.setView(viewRoot);
    android.support.v7.app.AlertDialog dialog = builder.create();
    dialog.show();
    dialog.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.MATCH_PARENT);
}