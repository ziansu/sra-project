@java.lang.Override
public boolean updateOrder(com.rd.lab.pizza_service.domain.order.Order order) {
    com.rd.lab.pizza_service.domain.order.Order toUpdate = getOrderById(order.getId());
    if (toUpdate != null) {
        toUpdate.setCustomer(order.getCustomer());
        toUpdate.setPizzas(order.getPizzas());
        toUpdate.setStatus(order.getStatus());
        toUpdate.setCost(order.getCost());
        return true;
    }
    return false;
}