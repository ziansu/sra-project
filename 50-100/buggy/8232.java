private boolean canCreateDeferredVertices() {
    return (((this.predicates) == null) && ((this.limit) == (org.mastik.query.Query.noLimit()))) && ((this.orders) == (org.mastik.query.Query.noOrders()));
}