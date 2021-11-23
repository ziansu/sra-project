@java.lang.Override
public void onClick(android.view.View view) {
    listElementsArrayList.add(((((listElementsArrayList.size()) + 1) + ".  ") + (txtStopWatch.getText().toString())));
    adapter.notifyDataSetChanged();
    listView.smoothScrollToPosition(adapter.getCount());
}