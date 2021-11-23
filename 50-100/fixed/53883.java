@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (resultCode == (RESULT_OK)) {
        java.lang.String newEditText = data.getExtras().getString("newEditedData");
        android.util.Log.d("SimpleToDoApp", ((("*************Request code: " + requestCode) + " with Data: ") + newEditText));
        items.set(requestCode, newEditText);
        itemsAdapter.notifyDataSetChanged();
        writeItems();
    }
}