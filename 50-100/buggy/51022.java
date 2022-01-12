public java.util.List<com.ian.onlinemall.domain.Goods> findItemByBrand(java.lang.String brand) {
    java.util.List<com.ian.onlinemall.domain.Goods> goods = getResultList(com.ian.onlinemall.domain.Goods.class, "where o.brand = ?1", null, null, null, brand);
    if ((goods != null) && ((goods.size()) > 0)) {
        return goods;
    }
    return null;
}