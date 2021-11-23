public T getItem(int position) {
    return position < (flexibleItems.size()) ? flexibleItems.get(position) : null;
}