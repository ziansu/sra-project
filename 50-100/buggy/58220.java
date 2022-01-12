public void uploadNewStatus() {
    final java.lang.String new_status = status.getText().toString();
    android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Void> uploadStatus = new android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Void>() {
        @java.lang.Override
        protected java.lang.Void doInBackground(java.lang.Void... voids) {
            new com.gnufsociety.openchallenge.ApiHelper().setStatus(currentUser, new_status);
            return null;
        }
    };
}