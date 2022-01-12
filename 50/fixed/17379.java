@java.lang.Override
public boolean onLongClick(android.view.View v) {
    int p = getAdapterPosition();
    return (((onLongClickListener) != null) && (p >= 0)) && (onLongClickListener.onLongClick(v, p));
}