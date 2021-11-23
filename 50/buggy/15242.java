public void onFinish() {
    android.util.Log.d("====>", "keke");
    com.novahub.voipcall.activity.MainActivity.GetStatusAsyncTask getStatusAsyncTask = new com.novahub.voipcall.activity.MainActivity.GetStatusAsyncTask(stringBuilder.toString());
    getStatusAsyncTask.execute();
}