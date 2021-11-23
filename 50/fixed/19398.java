public boolean isService() {
    if ((m_product) != null) {
        return !(org.adempiere.util.Services.get(de.metas.product.IProductBL.class).isItem(m_product));
    }
    return false;
}