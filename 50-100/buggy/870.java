public void onClick(android.content.DialogInterface dialog, int id) {
    if (!(userInput.getText().toString().isEmpty())) {
        if (groupCreate(userInput.getText().toString())) {
            groupRetriever();
            listAdapter.notifyDataSetChanged();
        }
    }
}