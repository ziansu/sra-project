public static java.util.List<amazon.mws.order.SkuSum> getSumByPruchaseDate(javax.xml.datatype.XMLGregorianCalendar createdAfter, javax.xml.datatype.XMLGregorianCalendar createdBefore) {
    if ((createdAfter == null) || (createdBefore == null))
        return null;
    
    return new amazon.mws.order.ListOrdersAndOrderItemsDatabase().selectSumByPruchaseDate(common.util.Time.getTime(createdAfter), common.util.Time.getTime(createdBefore));
}