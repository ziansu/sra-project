@java.lang.Override
protected void onPostExecute(java.lang.Void aVoid) {
    super.onPostExecute(aVoid);
    android.util.Log.d(LOG_TAG, "onPostExecute() called");
    if ((_throwException) != null) {
        android.content.Intent intent = new android.content.Intent(com.pervasive.sth.smarttreasurehunt.TreasureActivity.EXCEPTION_THROWN);
        intent.putExtra(TreasureActivity.EXCEPTION_NAME, _throwException.getMessage());
        _context.sendBroadcast(intent);
    }
}