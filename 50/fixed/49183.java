private int getClickPosition() {
    if ((getLayoutPosition()) >= (adapter.getHeaderLayoutCount())) {
        return (getLayoutPosition()) - (adapter.getHeaderLayoutCount());
    }
    return 0;
}