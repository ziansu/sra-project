@java.lang.Override
public boolean removeOrderElement(org.libreplan.business.orders.entities.OrderElement entity) {
    workReport.clearOrderElement(entity);
    return orderElements.remove(entity);
}