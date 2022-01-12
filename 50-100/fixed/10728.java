public po.GoodsModelPO set_signal_name(vo.GoodsVO goods) throws java.lang.Exception {
    java.util.HashMap<java.lang.String, po.GoodsModelPO> goodsModels = goodsListPO().getGoodsModels();
    po.GoodsModelPO temp = goodsModels.get(goods.id);
    temp.setName(goods.name);
    if ((goods.amount) < 0) {
        return null;
    }
    temp.setSignal(goods.amount);
    return temp;
}