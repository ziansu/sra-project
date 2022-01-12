public java.util.List<org.eyeseetea.malariacare.data.database.model.Header> getHeaders() {
    if ((headers) == null) {
        headers = new com.raizlabs.android.dbflow.sql.language.Select().from(org.eyeseetea.malariacare.data.database.model.Header.class).where(Header_Table.id_tab.eq(this.getId_tab())).orderBy(Header_Table.order_pos, true).queryList();
    }
    return headers;
}