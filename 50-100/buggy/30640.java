public synchronized com.limpygnome.parrot.library.db.DatabaseNode remove() {
    if ((parent) != null) {
        parent.children.remove(id);
        parent.deletedChildren.add(id);
        database.getLookup().remove(id);
        parent = null;
        database.setDirty(true);
    }
    return this;
}