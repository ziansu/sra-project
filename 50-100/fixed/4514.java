@java.lang.Override
public boolean equals(java.lang.Object object) {
    if (!(object instanceof it.cnr.istc.sponsor.db.UserEntity)) {
        return false;
    }
    it.cnr.istc.sponsor.db.UserEntity other = ((it.cnr.istc.sponsor.db.UserEntity) (object));
    return !((((this.id) == null) && ((other.id) != null)) || (((this.id) != null) && (!(this.id.equals(other.id)))));
}