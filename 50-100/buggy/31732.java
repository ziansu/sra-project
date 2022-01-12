@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (obj == (this)) {
        return true;
    }
    if (obj instanceof org.entermediadb.asset.Category) {
        org.entermediadb.asset.Category c = ((org.entermediadb.asset.Category) (obj));
        java.lang.String id = c.getId();
        if ((id != null) || (id.equals(getId()))) {
            return true;
        }
    }
    return false;
}