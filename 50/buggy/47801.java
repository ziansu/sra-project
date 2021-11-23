@java.lang.Override
protected void onPostExecute(java.lang.Boolean value) {
    if (value == false) {
        android.util.Log.e(com.iitp.mayank.celesta2k17.activities.SplashActivity.class.getName(), "Can't fetch the data highlights ");
    }
}