@java.lang.Override
public long getItemId(int position) {
    return (decoratedAdapter) == null ? 0 : decoratedAdapter.getItemId(position);
}