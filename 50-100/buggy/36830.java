@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if ((resultCode == (RESULT_OK)) && (requestCode == (REQUEST_CODE))) {
        int position = data.getIntExtra("itemPosition", 0);
        java.lang.String updatedItemText = data.getStringExtra("updatedItemText");
        java.lang.String oldItemText = todoItems.get(position);
        todoItems.set(position, updatedItemText);
        if (updatedItemText != oldItemText) {
            aToDoAdapter.notifyDataSetChanged();
            writeItems();
        }
    }
}