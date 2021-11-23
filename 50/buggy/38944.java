public T getItem(int position) {
    return position < (flexibleItems.size()) ? getItem(position) : null;
}