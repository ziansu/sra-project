@java.lang.Override
public void onClick(android.view.View v) {
    itemClickListener.onItemClick(adapter.getItem(position), view, position);
}