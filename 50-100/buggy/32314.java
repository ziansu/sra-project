@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (!(obj instanceof com.dotcms.uuid.shorty.ShortyId)) {
        return false;
    }
    com.dotcms.uuid.shorty.ShortyId newShorty = ((com.dotcms.uuid.shorty.ShortyId) (obj));
    return ((((newShorty.longId) == (this.longId)) && ((newShorty.type) == (this.type))) && ((newShorty.subType) == (this.subType))) && ((newShorty.shortId) == (this.shortId));
}