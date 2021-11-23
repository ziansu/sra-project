public java.util.HashMap<java.lang.String, java.lang.Double> getNameAndPriceByGoodsID(java.lang.Integer goodsID) {
    java.util.HashMap<java.lang.String, java.lang.Double> hashMap = new java.util.HashMap<>();
    main.unsolidwinner.model.Goods goods = em.find(main.unsolidwinner.model.Goods.class, goodsID);
    hashMap.put(goods.getName(), goods.getUnitPrice());
    return hashMap;
}