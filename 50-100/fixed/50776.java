@java.lang.Override
public long getItemId(int position) {
    if (position == 0) {
        return refreshingTop ? NO_ID : adapter.getItemId(0);
    }else {
        if (refreshingTop) {
            return (position - 1) >= (adapter.getItemCount()) ? NO_ID : adapter.getItemId((position - 1));
        }else {
            return position >= (adapter.getItemCount()) ? NO_ID : adapter.getItemId(position);
        }
    }
}