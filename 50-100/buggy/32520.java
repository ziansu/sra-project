public void deleteAttachedObjects(java.lang.Long id) {
    java.lang.String query = "DELETE FROM TrackingObject to WHERE to.saleOrder.id = :saleOrder";
    entityManager.createQuery(query).setParameter("saleOrder", id).executeUpdate();
    java.lang.String deleteMessage = messages.getLabel("stock_track_source_sale_order_deleted");
    query = "UPDATE ProductStockModification psm SET psm.saleOrder = NULL, psm.sourceNumber = :deleteMessage where psm.saleOrder.id = :idSaleOrder";
    entityManager.createQuery(query).setParameter("idSaleOrder", id).setParameter("deleteMessage", deleteMessage).executeUpdate();
    query = "UPDATE Sale sale SET sale.saleOrderId = NULL WHERE sale.saleOrderId = :saleOrderId";
    entityManager.createQuery(query).setParameter("saleOrderId", (id + ""));
}