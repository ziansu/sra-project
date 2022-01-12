public java.util.List<com.ian.onlinemall.domain.Goods> findItemByNameOrDesc(java.lang.String name, java.lang.String desc) {
    java.util.List<com.ian.onlinemall.domain.Goods> goods = getResultList(com.ian.onlinemall.domain.Goods.class, "where o.name like %?1% or o.description like %?2%", null, name, desc);
    if ((goods != null) && ((goods.size()) > 0)) {
        return goods;
    }
    return null;
}