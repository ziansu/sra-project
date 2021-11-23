@android.annotation.TargetApi(value = 23)
public void updateListView(int position) {
    android.view.View v = getListView();
    android.widget.ListView listView = ((android.widget.ListView) (v.findViewById(android.R.id.list)));
    listView.setAdapter(new com.firefly.shoppomem.PendingItemAdapter(getContext(), R.layout.pending_list_row, com.firefly.shoppomem.HistoryActivity.getHistoryList().get(position).getmItemsList()));
    currentPosition = position;
}