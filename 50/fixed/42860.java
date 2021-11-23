protected void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    java.lang.System.out.println(1);
    saveState();
    outState.putSerializable(TodoDatabaseAdapter.KEY_ROWID, mRowId);
}