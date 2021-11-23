private boolean canCreateDeferredVertices() {
    return ((this.predicates.isEmpty()) && ((this.limit) == (org.mastik.query.Query.noLimit()))) && ((this.orders) == (org.mastik.query.Query.noOrders()));
}