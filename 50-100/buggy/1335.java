public main.unsolidwinner.controller.HashMap<java.lang.String, java.lang.Double> getNameAndPriceByGoodsID(java.lang.Integer goodsID) {
    main.unsolidwinner.controller.HashMap<java.lang.String, java.lang.Double> hashMap = new main.unsolidwinner.controller.HashMap();
    main.unsolidwinner.model.Goods goods = em.find(main.unsolidwinner.model.Goods.class, goodsID);
    hashMap.put(goods.getName(), goods.getUnitPrice());
    return hashMap;
}