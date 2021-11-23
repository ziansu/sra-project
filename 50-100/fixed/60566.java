@java.lang.Override
public int compare(rs.dodatnaoprema.dodatnaoprema.models.articles.Article a1, rs.dodatnaoprema.dodatnaoprema.models.articles.Article a2) {
    if ((rs.dodatnaoprema.dodatnaoprema.common.utils.Conversions.priceStringToFloat(a1.getCenaSamoBrojFormat())) == (rs.dodatnaoprema.dodatnaoprema.common.utils.Conversions.priceStringToFloat(a2.getCenaSamoBrojFormat())))
        return 0;
    
    if ((rs.dodatnaoprema.dodatnaoprema.common.utils.Conversions.priceStringToFloat(a1.getCenaSamoBrojFormat())) > (rs.dodatnaoprema.dodatnaoprema.common.utils.Conversions.priceStringToFloat(a2.getCenaSamoBrojFormat())))
        return -1;
    
    return 1;
}