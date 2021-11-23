@java.lang.Override
public void onRightCardExit(java.lang.Object dataObject) {
    al.remove(0);
    questionAdapter.notifyDataSetChanged();
}