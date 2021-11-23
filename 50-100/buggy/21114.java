@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    progress.dismiss();
    notification.setText(result);
    if (!(result.equals("NOT AUTHENTICATED"))) {
        android.content.Intent i = new android.content.Intent(this, com.test.root.arm.Selection.class);
        i.putExtra("json", result);
        startActivity(i);
    }
}