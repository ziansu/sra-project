public static java.lang.String getMarkerTitle(im.goody.android.data.dto.Deal deal) {
    java.lang.String title;
    if (deal == null)
        return null;
    
    if (im.goody.android.utils.TextUtils.isEmpty(deal.getTitle()))
        title = (deal.getDescription().substring(0, Constants.TITLE_CHARACTERS_COUNT).trim()) + "...";
    else
        title = deal.getTitle();
    
    return title;
}