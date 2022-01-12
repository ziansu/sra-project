@java.lang.Override
protected void onRestoreInstanceState(android.os.Bundle savedInstanceState) {
    mQuery = savedInstanceState.getString("query");
    super.onRestoreInstanceState(savedInstanceState);
}