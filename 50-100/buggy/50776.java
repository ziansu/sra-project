@java.lang.Override
public long getItemId(int position) {
    if (position == 0) {
        return refreshingTop ? NO_ID : adapter.getItemId(0);
    }else {
        return position == (adapter.getItemCount()) ? NO_ID : adapter.getItemId(position);
    }
}