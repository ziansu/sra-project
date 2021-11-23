private java.lang.String selectItem(java.lang.String itemNameCondition, java.lang.String stockCondition, java.lang.String priceCondition) {
    java.lang.String query = "";
    if (!(((itemNameCondition.equals("")) || (stockCondition.equals(""))) || (priceCondition.equals("")))) {
        query = (("WHERE " + itemNameCondition) + stockCondition) + priceCondition;
    }
    return query;
}