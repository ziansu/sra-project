@java.lang.Override
public void finish(int orderId) {
    ecommerce.rmall.domain.Order order = this.orderDao.findByID(orderId);
    if (null != order) {
        if ((order.getStatus().equals("processing")) && (null != (order.getShipment()))) {
            order.getShipment().setStatus("finish");
            this.shipmentDao.update(order.getShipment());
        }
        order.setStatus("finish");
        this.orderDao.update(order);
    }
}