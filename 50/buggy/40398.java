@java.lang.Override
public java.util.List<edu.nju.express.po.OrderPO> getOrders() {
    java.util.List<edu.nju.express.po.OrderPO> other = new java.util.ArrayList(orders.size());
    java.util.Collections.copy(other, orders);
    return other;
}