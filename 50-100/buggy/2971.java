@java.lang.Override
protected void onPostExecute(java.lang.Integer s) {
    super.onPostExecute(s);
    if (s.equals(DOWNLOAD_SUCCESS)) {
        if ((handler) != null) {
            handler.obtainMessage(DownLoadActivity.DOWNLOAD_FINISH, position).sendToTarget();
        }
        android.widget.Toast.makeText(context, context.getString(R.string.download_success), Toast.LENGTH_SHORT).show();
    }else {
        android.widget.Toast.makeText(context, context.getString(R.string.download_fail), Toast.LENGTH_SHORT).show();
    }
}