@java.lang.Override
public void onClick(android.view.View view) {
    adapter.add(((((adapter.getCount()) + 1) + ".  ") + (txtStopWatch.getText().toString())));
    adapter.notifyDataSetChanged();
    listView.smoothScrollToPosition(adapter.getCount());
}