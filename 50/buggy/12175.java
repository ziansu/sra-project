@java.lang.Override
public long getItemId(int position) {
    return isEmptyList() ? 0 : goodsItemList.size();
}