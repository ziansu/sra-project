@java.lang.Override
public void finish(int orderId) {
    ecommerce.rmall.domain.Order order = this.orderDao.findByID(orderId);
    if (null != order) {
        order.setStatus("finish");
        if ((order.getStatus().equals("processing")) && (null != (order.getShipment()))) {
            order.getShipment().setStatus("finish");
            this.shipmentDao.update(order.getShipment());
        }
        this.orderDao.update(order);
    }
}