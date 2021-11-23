@java.lang.Override
protected void onPostExecute(java.lang.String error) {
    if (error.isEmpty()) {
        writeLog();
        android.content.Intent i = new android.content.Intent(this, com.epfl.dedis.cisc.ConfigActivity.class);
        startActivity(i);
        this.finish();
    }else {
        toast(error);
    }
}