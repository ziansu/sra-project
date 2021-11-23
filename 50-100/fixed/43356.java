public static java.lang.String getIcon(long goodsId) {
    java.util.List<models.GoodsIcon> icons = dao.GoodsIconDao.getByGoods(goodsId);
    if (org.apache.commons.collections.CollectionUtils.isEmpty(icons)) {
        return "";
    }
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    java.lang.String sep = "";
    for (models.GoodsIcon icon : icons) {
        sb.append(sep);
        sb.append(icon.getIconUrl());
        sep = common.constants.Separator.COMMON_SEPERATOR_COMME;
    }
    return sb.toString();
}