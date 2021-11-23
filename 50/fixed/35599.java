@java.lang.Override
protected void onPerformAction() {
    super.onPerformAction();
    adapter.data.remove(position);
    adapter.notifyItemRemoved(position);
}