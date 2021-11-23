@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    setListAdapter(new android.widget.ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, com.firefly.shoppomem.HistoryActivity.getHistoryList()));
}