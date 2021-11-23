@java.lang.Override
public void onMenuItemLongClick(android.view.View clickedView, int position) {
    android.widget.Toast.makeText(this, ("Long clicked on position: " + position), Toast.LENGTH_SHORT).show();
}