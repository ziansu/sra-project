@java.lang.Override
protected void onPostExecute(java.lang.Integer s) {
    super.onPostExecute(s);
    if ((handler) != null) {
        handler.obtainMessage(DownLoadActivity.DOWNLOAD_FINISH, position, 0).sendToTarget();
    }
    if (s.equals(DOWNLOAD_SUCCESS)) {
        android.widget.Toast.makeText(context, context.getString(R.string.download_success), Toast.LENGTH_SHORT).show();
    }else {
        android.widget.Toast.makeText(context, context.getString(R.string.download_fail), Toast.LENGTH_SHORT).show();
    }
}