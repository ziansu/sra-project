@android.annotation.TargetApi(value = 23)
@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    setListAdapter(new android.widget.ArrayAdapter(getContext(), android.R.layout.simple_list_item_1, com.firefly.shoppomem.HistoryActivity.getHistoryList()));
}