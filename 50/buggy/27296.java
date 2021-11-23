@java.lang.Override
public long getItemId(int position) {
    return getItem(position).hashCode();
}