@java.lang.Override
public void run() {
    if (adapter != null) {
        adapter.notifyDataSetChanged();
    }
}