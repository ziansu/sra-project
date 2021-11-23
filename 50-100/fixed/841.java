public void postDonation(final java.lang.String token, final android.app.Activity sourceActivity) {
    new android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Void>() {
        @java.lang.Override
        protected java.lang.Void doInBackground(java.lang.Void... params) {
            try {
                billingService.consumePurchase(3, sourceActivity.getPackageName(), token);
            } catch (java.lang.Exception ignored) {
            }
            return null;
        }
    }.execute();
}