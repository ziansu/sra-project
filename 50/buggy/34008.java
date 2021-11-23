@java.lang.Override
public boolean onLongClick(android.view.View v) {
    listenerLongClick.onCellSelected(row, col);
    return false;
}