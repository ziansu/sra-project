private boolean containsRPurchase(uwi.dcit.agriexpensesvr.ResourcePurchase rpurchase) {
    com.google.appengine.api.NamespaceManager.set(rpurchase.getAccount());
    javax.persistence.EntityManager mgr = uwi.dcit.agriexpensesvr.ResourcePurchaseEndpoint.getEntityManager();
    boolean contains = true;
    try {
        uwi.dcit.agriexpensesvr.ResourcePurchase item = mgr.find(uwi.dcit.agriexpensesvr.ResourcePurchase.class, rpurchase.getKey());
        if (item == null) {
            contains = false;
        }
    } finally {
    }
    return contains;
}