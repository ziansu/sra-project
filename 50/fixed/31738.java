@java.lang.Override
public int compare(com.brand.ushopping.model.OrderItem orderItem, com.brand.ushopping.model.OrderItem t1) {
    java.lang.Long id1 = orderItem.getReTime();
    java.lang.Long id2 = t1.getReTime();
    return id1.compareTo(id2);
}