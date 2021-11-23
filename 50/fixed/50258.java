public void edit(int position, java.lang.Thread item) {
    mItems.set(position, item);
    notifyItemChanged(position);
}