public final int getSectionItemsTotal() {
    int contentItemsTotal = 0;
    switch (state) {
        case LOADING :
            contentItemsTotal += 1;
            break;
        case LOADED :
            contentItemsTotal += getContentItemsTotal();
            break;
        case FAILED :
            contentItemsTotal += 1;
            break;
        default :
            throw new java.lang.IllegalStateException("Invalid state");
    }
    return (contentItemsTotal + (hasHeader ? 1 : 0)) + (hasFooter ? 1 : 0);
}