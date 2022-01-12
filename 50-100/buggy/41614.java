@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o) {
        return true;
    }
    if ((o == null) || ((getClass()) != (o.getClass()))) {
        return false;
    }
    com.mycompany.sos.model.Order order = ((com.mycompany.sos.model.Order) (o));
    return (((orderId) == (order.orderId)) && (java.util.Objects.equals(customer, order.customer))) && (java.util.Objects.equals(items, order.items));
}