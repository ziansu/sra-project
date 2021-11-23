protected void onPostExecute(java.lang.Integer result) {
    android.widget.ProgressBar spinner = ((android.widget.ProgressBar) (findViewById(R.id.progressBar)));
    spinner.setVisibility(View.GONE);
    android.widget.TextView button = ((android.widget.TextView) (findViewById(R.id.labelBeaconFoundNotififaction)));
    button.setVisibility(View.VISIBLE);
    cart.clear();
    postNotification("Your meal will be prepared!");
}