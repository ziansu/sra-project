@java.lang.Override
public T getItem(int position) {
    return position < (itemAccessor.size()) ? super.getItem(position) : null;
}