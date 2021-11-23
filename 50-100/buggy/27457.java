@java.lang.Override
public int compare(models.GenericArticle a1, models.GenericArticle a2) {
    int c = sortRebate(a1, a2);
    if (c == 0)
        c = sortSales(a1, a2);
    
    if (c == 0)
        c = sortAutoGenerika(a1, a2);
    
    if (c == 0)
        c = sortRosePreference(a1, a2);
    
    if (c == 0)
        c = sortShippingStatus(a1, a2, quantity);
    
    return c;
}