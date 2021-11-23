public boolean getHasNextPage() {
    return ((getPageLastItem()) + 1) < (getItemCount());
}