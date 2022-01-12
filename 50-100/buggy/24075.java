private void updateEnCategory(de.ironjan.mensaupb.stw.filters.RawMenu menu) {
    java.lang.String subcategory_en = menu.getSubcategory_en();
    if ((subcategory_en != null) && (de.ironjan.mensaupb.stw.filters.TextUtils.isEmpty(subcategory_en.trim()))) {
        return ;
    }
    menu.setCategory_en(subcategory_en);
}