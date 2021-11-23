@java.lang.Override
public java.util.Collection<com.restaurant.model.Product> findAllNotByStatus(java.lang.String status) {
    java.util.Collection<com.restaurant.model.Product> products = new java.util.ArrayList<com.restaurant.model.Product>();
    for (java.util.Map.Entry<java.lang.String, java.lang.String> pair : Status.STATUS_MAP.entrySet()) {
        if (!(pair.getKey().equals(status))) {
            products.addAll(findAllByStatus(pair.getKey()));
        }
    }
    return products;
}