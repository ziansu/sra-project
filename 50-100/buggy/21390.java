@java.lang.Override
public java.lang.String getLastDeliveryAddressForUser(java.lang.Integer userId) {
    com.biol.biolbg.business.util.FindOrderCriteria findOrderCriteria = new com.biol.biolbg.business.util.FindOrderCriteria(null, null, userId, null, null);
    com.biol.biolbg.business.util.SortCriteria sortCriteria = new com.biol.biolbg.business.util.SortCriteria("o.id", com.biol.biolbg.business.util.SortCriteria.DIRECTION_DESC);
    java.util.List<com.biol.biolbg.business.entity.Order> orders = orderDaoBean.findByCriteria(findOrderCriteria, 1, 1, sortCriteria);
    if ((orders != null) && ((orders.size()) > 0)) {
        return orders.get(1).getDeliveryAddress();
    }
    return "";
}