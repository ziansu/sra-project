@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if ((this) == obj) {
        return true;
    }
    if (obj instanceof java.lang.Long) {
        return this.id.equals(obj);
    }
    if (obj instanceof tk.itworks10.bookshelf.model.entity.Entity) {
        return ((this.id) != null) && (this.id.equals(((tk.itworks10.bookshelf.model.entity.Entity) (obj)).id));
    }
    return false;
}