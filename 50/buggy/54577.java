@java.lang.Override
public void onItemLongClick(android.view.View view, int position) {
    android.util.Log.d(TAG, (position + ""));
    setPosition(position);
    view.showContextMenu();
}