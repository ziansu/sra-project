@java.lang.SuppressWarnings(value = "deprecation")
@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> arg0, android.view.View arg1, final int arg2, long arg3) {
    position = java.lang.String.valueOf(arg2);
    myAdapter.setSelectItem(arg2);
    if (selflag) {
        selflag = false;
        position = "";
    }else {
        selflag = true;
    }
    myAdapter.notifyDataSetChanged();
}