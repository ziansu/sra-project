private void showSnackbar(java.lang.String message) {
    android.support.design.widget.Snackbar.make(parentLayout, "This is main activity", Snackbar.LENGTH_LONG).setAction("CLOSE", new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View view) {
        }
    }).setActionTextColor(getResources().getColor(android.R.color.holo_red_light)).show();
}