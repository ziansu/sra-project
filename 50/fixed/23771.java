public void setListing(java.lang.String listing) {
    if (listing == null)
        return ;
    
    cmanager.Geocache.offloadingCache.put((((hashCode()) + (getCode())) + "listing"), listing);
}