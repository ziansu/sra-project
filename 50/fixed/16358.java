private void sendResult(com.example.mborzenkov.readlaterlist.adt.ReadLaterItem resultData) {
    android.content.Intent resultIntent = new android.content.Intent();
    resultIntent.putExtra(ReadLaterItemParcelable.KEY_EXTRA, (resultData == null ? null : new com.example.mborzenkov.readlaterlist.adt.ReadLaterItemParcelable(resultData)));
    setResult(com.example.mborzenkov.readlaterlist.activity.RESULT_OK, resultIntent);
    finish();
}