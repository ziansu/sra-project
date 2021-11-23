@java.lang.Override
protected void onResume() {
    super.onResume();
    android.util.Log.i("HS U", "onResume");
    java.util.List<com.aiqing.niuniuheardsensor.Utils.db.beans.HSRecord> recordsDB = com.aiqing.niuniuheardsensor.Utils.db.dao.HSRecordsDaos.getInstance(this).getAllRecords();
    if ((recordsDB != null) && ((recordsDB.size()) > 0)) {
        recordsDB.remove(0);
        records.clear();
        records.addAll(recordsDB);
    }
    recordsAdapter.notifyDataSetChanged();
}