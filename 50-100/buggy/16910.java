@android.support.annotation.RequiresApi(api = Build.VERSION_CODES.KITKAT)
public void sendSms(final java.lang.String to, final java.lang.String from, @android.support.annotation.Nullable
final com.craftsman.moozisms.MOOZISMS.Callback callback) {
    checkSafety();
    final java.lang.String receiverId = cleanReceiverId(to);
    new android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Boolean>() {
        @android.annotation.TargetApi(value = Build.VERSION_CODES.KITKAT)
        @java.lang.Override
        protected java.lang.Boolean doInBackground(java.lang.Void... voids) {
            return sendSMS(receiverId, from);
        }

        @java.lang.Override
        protected void onPostExecute(java.lang.Boolean aBoolean) {
            super.onPostExecute(aBoolean);
            callback.onFinish(aBoolean);
        }
    }.execute();
}