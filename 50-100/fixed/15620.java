void setId(net.symplifier.db.Model<T> model, java.lang.Long id) {
    this.id = id;
    this.model = model;
    if (((ref) != null) && ((id == null) || (!(id.equals(ref.getId()))))) {
        ref = null;
    }
}