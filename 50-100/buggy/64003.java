void abort() {
    aborting = true;
    synchronized(synchronization) {
        if ((response) != null) {
            final okhttp3.Response finalResponse = response;
            response = null;
            new android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Void>() {
                @java.lang.Override
                protected java.lang.Void doInBackground(java.lang.Void... voids) {
                    try {
                        finalResponse.body().close();
                    } catch (java.lang.IllegalStateException e) {
                    }
                    return null;
                }
            }.execute();
        }
    }
}