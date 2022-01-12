public void savePage(int page_number) throws java.io.IOException, team_7adota.DBAppException {
    int page_index = getPageIndexInArrayList(page_number);
    Structure.Page pageToInsert = this.getPageByNumber(page_number);
    if ((pages_loaded_is_changed.get(page_index).booleanValue()) == false) {
        return ;
    }
    pageToInsert.serializePage(((((this.table_name) + "-") + page_number) + ".ser"));
    java.lang.Boolean b = pages_loaded_is_changed.get(page_index);
    b = new java.lang.Boolean(false);
}