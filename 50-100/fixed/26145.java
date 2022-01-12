public boolean regenerateShipListXls(int orderId, java.lang.String start, java.lang.String end) {
    if (orderId == 0)
        return false;
    
    try {
        com.chdp.chdpweb.bean.Order orderItem = orderDao.getOrderById(orderId);
        java.util.List<com.chdp.chdpweb.bean.Prescription> prsList = this.getPrsListByOrderId(orderId, start, end);
        if ((generatePrsListXls(orderItem.getHospital_id(), orderItem.getUuid(), prsList)) != null) {
            return true;
        }else {
            return false;
        }
    } catch (java.lang.Exception e) {
        return false;
    }
}