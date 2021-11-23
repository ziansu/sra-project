private int getClickPosition() {
    return (getLayoutPosition()) - (adapter.getHeaderLayoutCount());
}