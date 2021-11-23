@java.lang.Override
protected void onPostExecute(java.lang.String[] NameData) {
    if (NameData != null) {
        mAdapter.setData(NameData, getApplicationContext());
    }else {
        mAdapter.setData(null, getApplicationContext());
    }
}