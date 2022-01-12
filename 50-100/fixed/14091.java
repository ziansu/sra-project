private void checkifOnline() {
    if (alreadyExecuted = false) {
        alreadyExecuted = true;
        if (isOnline()) {
            android.widget.Toast.makeText(getApplicationContext(), "PULL DATA", Toast.LENGTH_SHORT).show();
            pullDataFromFireBase();
        }else {
            mTodos.addAll(TDdb.getAllTodos());
        }
    }
}