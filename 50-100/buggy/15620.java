void setId(net.symplifier.db.Model<T> model, long id) {
    this.id = id;
    this.model = model;
    if (((ref) != null) && ((ref.getId()) != id)) {
        ref = null;
    }
}