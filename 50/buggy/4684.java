private void showProgressToast(java.lang.String message) {
    if (this.showProgress) {
        int duration = android.widget.Toast.LENGTH_SHORT;
        android.widget.Toast toast = android.widget.Toast.makeText(context, message, duration);
        toast.show();
    }
}