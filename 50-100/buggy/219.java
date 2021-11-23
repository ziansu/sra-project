@java.lang.Override
public void run() {
    int visibility = android.view.View.INVISIBLE;
    int x = 0;
    if (((showDeleteButtonPosition) != (-1)) && ((showDeleteButtonPosition) == position)) {
        visibility = android.view.View.VISIBLE;
        x = -(holder.deleteButton().getMeasuredWidth());
    }
    holder.deleteButton().setVisibility(visibility);
    holder.itemView.setX(x);
}