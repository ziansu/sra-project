@java.lang.Override
public void run() {
    listAdapter.notifyDataSetChanged();
    recyclerView.smoothScrollToPosition(((checkpoints.size()) - 1));
}