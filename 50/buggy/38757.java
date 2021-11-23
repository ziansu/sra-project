@javax.jws.WebMethod
public java.lang.String getWeeklySalesForItemXml(long ean, java.util.Date weekStart, int numberOfWeeks) throws pb138.service.exceptions.EntityDoesNotExistException {
    return serializeOverviewResultItem(overviewProvider.getWeeklySalesForItem(ean, weekStart, numberOfWeeks));
}