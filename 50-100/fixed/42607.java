@java.lang.Override
public boolean equals(java.lang.Object that) {
    if ((this) == that) {
        return true;
    }
    if (that instanceof org.atlasapi.persistence.content.listing.ContentListingCriteria) {
        org.atlasapi.persistence.content.listing.ContentListingCriteria other = ((org.atlasapi.persistence.content.listing.ContentListingCriteria) (that));
        return ((this.progress.equals(other.progress)) && (this.publishers.equals(other.publishers))) && (this.categories.equals(other.categories));
    }
    return false;
}