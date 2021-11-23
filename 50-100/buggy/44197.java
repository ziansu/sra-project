@java.lang.Override
protected void onPostExecute(java.lang.String s) {
    super.onPostExecute(s);
    if (s != null) {
        dialog.dismiss();
        android.widget.Toast.makeText(context, ((context.getString(R.string.storage)) + s), Toast.LENGTH_LONG).show();
        ((android.app.Activity) (context)).finish();
    }else {
        android.widget.Toast.makeText(context, R.string.failure, Toast.LENGTH_SHORT).show();
    }
}