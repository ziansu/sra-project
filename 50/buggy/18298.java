@java.lang.Override
public void run() {
    if ((isRefreshing) == 1) {
        android.widget.Toast.makeText(getActivity(), "Connection Failed", Toast.LENGTH_SHORT).show();
        swipeLayout.setRefreshing(false);
    }
}