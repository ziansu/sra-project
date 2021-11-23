private int minStock(models.GenericArticle article) {
    float sales_figure = 0.0F;
    if (models.ShoppingRose.m_sales_figures_map.containsKey(article.getPharmaCode()))
        sales_figure = ((2.5F * (models.ShoppingRose.m_sales_figures_map.get(article.getPharmaCode()))) * 1.0F) + 1.0F;
    else
        return -1;
    
    return ((int) (sales_figure));
}