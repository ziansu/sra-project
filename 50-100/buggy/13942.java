@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if ((o == null) || ((getClass()) != (o.getClass())))
        return false;
    
    com.sebastian.sokolowski.auctionhunter.database.models.TargetItem that = ((com.sebastian.sokolowski.auctionhunter.database.models.TargetItem) (o));
    return (id) != null ? id.equals(that.id) : (that.id) == null;
}