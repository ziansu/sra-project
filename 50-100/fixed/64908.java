public java.lang.Integer getIndex() {
    if ((((index) == null) && ((page) != null)) && ((limit) != null)) {
        return ((page) - 1) * (limit);
    }
    if ((index) == null) {
        return io.coodoo.framework.listing.control.ListingConfig.DEFAULT_INDEX;
    }
    return index;
}