@java.lang.Override
protected void onPostExecute(java.lang.Boolean result) {
    if (result) {
        toast(R.string.suc_network);
        writeLog();
        android.content.Intent i = new android.content.Intent(this, com.epfl.dedis.cisc.ConfigActivity.class);
        startActivity(i);
        this.finish();
    }else {
        toast(R.string.err_network);
    }
}