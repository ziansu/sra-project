@java.lang.Override
public T getItem(int position) {
    return (position < (itemAccessor.size())) && (position >= 0) ? super.getItem(position) : null;
}