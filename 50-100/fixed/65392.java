public static java.lang.String getMarkerTitle(im.goody.android.data.dto.Deal deal) {
    java.lang.String title;
    if (deal == null)
        return null;
    
    if (im.goody.android.utils.TextUtils.isEmpty(deal.getTitle()))
        title = deal.getDescription();
    else
        title = deal.getTitle();
    
    return title;
}