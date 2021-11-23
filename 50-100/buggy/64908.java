public java.lang.Integer getIndex() {
    if (((index) == null) && ((page) != null)) {
        return ((page) - 1) * (limit);
    }else
        if ((index) == null) {
            return io.coodoo.framework.listing.control.ListingConfig.DEFAULT_INDEX;
        }
    
    return index;
}