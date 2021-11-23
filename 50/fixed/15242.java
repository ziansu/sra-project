public void onFinish() {
    com.novahub.voipcall.activity.MainActivity.GetStatusAsyncTask getStatusAsyncTask = new com.novahub.voipcall.activity.MainActivity.GetStatusAsyncTask(stringBuilder.toString());
    getStatusAsyncTask.execute();
}