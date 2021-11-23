public void onClick(android.content.DialogInterface dialog, int pPosition) {
    mDisplayMainList.add(passedPosition, input.getText().toString());
    ((android.widget.BaseAdapter) (mListView.getAdapter())).notifyDataSetChanged();
}