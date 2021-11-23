private void updateEnCategory(de.ironjan.mensaupb.stw.filters.RawMenu menu) {
    java.lang.String subcategory_en = menu.getSubcategory_en();
    subcategory_en = (subcategory_en != null) ? subcategory_en.trim() : subcategory_en;
    if (de.ironjan.mensaupb.stw.filters.TextUtils.isEmpty(subcategory_en)) {
        return ;
    }
    menu.setCategory_en(subcategory_en);
}