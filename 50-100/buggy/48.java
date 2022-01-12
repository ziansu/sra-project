@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> arg0, android.view.View arg1, int arg2, long arg3) {
    int position = ((int) (arg3));
    int end = (commonListAdpt.getCount()) - 1;
    if (position == (end - 1)) {
    }
    if (position == end) {
        doLogout();
    }
}