@java.lang.Override
public void onItemLongClick(android.view.View view, int position) {
    setPosition(position);
    view.showContextMenu();
}