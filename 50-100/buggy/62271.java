@java.lang.Override
public void onLogGet(java.util.List<com.example.android.common.logger.LogItem> result) {
    list.clear();
    if (result != null) {
        list.addAll(result);
    }
    if ((adapter) == null) {
        adapter = new cn.androidy.thinking.adapters.LogListAdapter(getActivity(), getLogTag(), result);
        listView.setAdapter(adapter);
    }else {
        adapter.notifyDataSetChanged();
    }
}