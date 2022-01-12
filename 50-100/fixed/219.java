@java.lang.Override
public void run() {
    int x = 0;
    if (((showDeleteButtonPosition) != (-1)) && ((showDeleteButtonPosition) == position)) {
        x = -(holder.deleteButton().getMeasuredWidth());
    }
    holder.itemView.setX(x);
}