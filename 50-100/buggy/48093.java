@java.lang.Override
public boolean equals(java.lang.Object obj) {
    try {
        org.uqbar.commons.model.Entity otherEntity = ((org.uqbar.commons.model.Entity) (obj));
        if (((this.id) == null) || ((otherEntity.getId()) == null)) {
            return super.equals(obj);
        }
        return (this.id) == (otherEntity.getId());
    } catch (java.lang.ClassCastException e) {
        return false;
    }
}