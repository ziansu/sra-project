@java.lang.Override
public com.aix.city.core.ListingFromEvent getListing() {
    if ((listing) == null) {
        com.aix.city.core.Listing listing = new com.aix.city.core.ListingFromEvent(this);
    }
    return listing;
}