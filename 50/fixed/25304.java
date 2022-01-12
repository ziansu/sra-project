@java.lang.Override
public com.leaven.mianjiao.bean.GoodsListItemBean getItem(int position) {
    return ((goodsItemList) == null) || ((goodsItemList.size()) <= position) ? null : goodsItemList.get(position);
}