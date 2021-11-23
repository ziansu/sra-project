@java.lang.Override
protected void init() {
    m_dlSales = ((uk.chromis.pos.forms.DataLogicSales) (app.getBean("uk.chromis.pos.forms.DataLogicSales")));
    jproductfilter = new uk.chromis.pos.ticket.ProductFilter();
    jproductfilter.init(app);
    row = m_dlSales.getProductsRow();
    lpr = new uk.chromis.data.user.ListProviderCreator(m_dlSales.getProductCatQBF(), jproductfilter);
    spr = new uk.chromis.data.user.SaveProvider(m_dlSales.getProductCatUpdate(), m_dlSales.getProductCatInsert(), m_dlSales.getProductCatDelete());
    jeditor = new uk.chromis.pos.inventory.ProductsEditor(m_dlSales, dirty);
}