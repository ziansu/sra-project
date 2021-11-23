public java.util.List<com.ian.onlinemall.domain.Goods> findItemBetweenPrice(double low, double high) {
    java.util.List<com.ian.onlinemall.domain.Goods> goods = getResultList(com.ian.onlinemall.domain.Goods.class, "where o.price <= ?1 and o.price >= ?2", null, null, null, low, high);
    if ((goods != null) && ((goods.size()) > 0)) {
        return goods;
    }
    return null;
}