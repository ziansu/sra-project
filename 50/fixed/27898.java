@java.lang.Override
public java.util.List<com.mall.po.GoodsPic> selectByGoodsId(java.lang.String goods_id) {
    return goodsPicMapper.selectByGoodsId(goods_id);
}