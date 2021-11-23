@com.google.api.server.spi.config.ApiMethod(name = "getRPurchase")
public uwi.dcit.agriexpensesvr.ResourcePurchase getRPurchase(@javax.inject.Named(value = "namespace")
java.lang.String namespace, @javax.inject.Named(value = "keyrep")
java.lang.String keyrep) {
    com.google.appengine.api.NamespaceManager.set(namespace);
    com.google.appengine.api.datastore.Key k = com.google.appengine.api.datastore.KeyFactory.stringToKey(keyrep);
    javax.persistence.EntityManager mgr = uwi.dcit.agriexpensesvr.ResourcePurchaseEndpoint.getEntityManager();
    uwi.dcit.agriexpensesvr.ResourcePurchase rpurchase = null;
    try {
        rpurchase = mgr.find(uwi.dcit.agriexpensesvr.ResourcePurchase.class, k);
    } finally {
        mgr.close();
    }
    java.lang.System.out.println("---000---");
    return rpurchase;
}