@javax.jws.WebMethod
public java.lang.String getDailySalesForCategoryXml(java.lang.String category, java.util.Date dayStart, int numberOfDays) throws pb138.service.exceptions.EntityDoesNotExistException {
    return serializeOverviewResultCategory(getDailySalesForCategory(category, dayStart, numberOfDays));
}