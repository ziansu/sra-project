protected void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    saveState();
    outState.putSerializable(TodoDatabaseAdapter.KEY_ROWID, mRowId);
}