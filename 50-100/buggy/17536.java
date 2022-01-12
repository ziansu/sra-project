@java.lang.Override
protected void onPostExecute(java.lang.Boolean aBoolean) {
    if (aBoolean) {
        updateJobs(list);
    }else {
        android.widget.Toast.makeText(this, (((getString(R.string.query_error)) + " -refreshJobs- ") + (ERROR)), Toast.LENGTH_SHORT).show();
    }
}