private java.lang.String computeOrderClause() {
    if (((orderPath) == null) || ((order) == null))
        return "";
    
    return ((((com.salesforce.androidsdk.smartstore.store.QuerySpec.ORDER_BY) + (computeFieldReference(orderPath))) + " ") + (order.sql)) + " ";
}