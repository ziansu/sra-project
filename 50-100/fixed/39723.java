public static int getCountWithoutOrderItemsByPurchaseDateFromMWS(javax.xml.datatype.XMLGregorianCalendar createdAfter, javax.xml.datatype.XMLGregorianCalendar createdBefore) {
    if ((createdAfter == null) || (createdBefore == null))
        return -1;
    
    return new amazon.mws.order.ListOrdersAndOrderItemsDatabase().selectCountWithoutOrderItemsByPruchaseDate(common.util.Time.getTime(createdAfter), common.util.Time.getTime(createdBefore));
}