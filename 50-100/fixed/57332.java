@java.lang.Override
protected void onPostExecute(java.lang.Void aVoid) {
    android.content.Intent mainActivity = new android.content.Intent(this, net.ddns.mipster.schooled.activities.MainActivity.class);
    mainActivity.putExtra(SchooledApplication.ANNOUNCEMENT_DATA, announcementData);
    mainActivity.putExtra(SchooledApplication.SCHEDULE_DATA, ((excelData) == null ? null : excelData.getItem1()));
    mainActivity.putExtra(SchooledApplication.NOTE_DATA, ((excelData) == null ? null : excelData.getItem2()));
    mainActivity.putExtra(SchooledApplication.CLASSES_DATA, classes);
    startActivity(mainActivity);
    finish();
}