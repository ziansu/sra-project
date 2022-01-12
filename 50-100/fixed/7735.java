@java.lang.Override
public void updateQuality(mvc.models.Item item) {
    if ((item.getSellIn()) > 0)
        item.setQuality(((item.getQuality()) - (mvc.models.OrganicBananas.QUALITY_STEP)));
    else
        item.setQuality(((item.getQuality()) - ((mvc.models.OrganicBananas.QUALITY_STEP) * 2)));
    
}