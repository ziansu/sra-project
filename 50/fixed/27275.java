public java.lang.String getType() {
    return this.isFree() ? models.Session.TYPE_FREE : models.Session.TYPE_TAKEN;
}