public void onClick(android.content.DialogInterface dialog, int pPosition) {
    mDisplayMainList.set(passedPosition, input.getText().toString());
    ((android.widget.BaseAdapter) (mListView.getAdapter())).notifyDataSetChanged();
}