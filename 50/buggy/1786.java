@java.lang.Override
public boolean removeOrderElement(org.libreplan.business.orders.entities.OrderElement entity) {
    org.libreplan.web.users.dashboard.PersonalTimesheetModel.LOG.info(("workReport: " + (workReport)));
    workReport.clearOrderElement(entity);
    return orderElements.remove(entity);
}