void abort() {
    aborting = true;
    if ((response) != null) {
        new android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Void>() {
            @java.lang.Override
            protected java.lang.Void doInBackground(java.lang.Void... voids) {
                response.body().close();
                return null;
            }
        }.execute();
    }
}