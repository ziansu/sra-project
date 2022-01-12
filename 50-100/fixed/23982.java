@org.springframework.transaction.annotation.Transactional
@java.lang.Override
public void checkIfOrderReady(com.bionic.edu.entity.Orders order) {
    java.util.List<com.bionic.edu.entity.OrderDishes> undoneDishes = getUndoneDishesFromOrder(order.getId());
    if (undoneDishes.isEmpty()) {
        order.setOrderStatus(orderStatusDao.findById(3));
    }else {
        order.setOrderStatus(orderStatusDao.findById(2));
    }
    orderDao.save(order);
}