public java.util.List<org.eyeseetea.malariacare.data.database.model.Tab> getTabs() {
    if ((tabs) == null) {
        tabs = new com.raizlabs.android.dbflow.sql.language.Select().from(org.eyeseetea.malariacare.data.database.model.Tab.class).where(Tab_Table.id_program.eq(this.getId_program())).orderBy(com.raizlabs.android.dbflow.sql.language.OrderBy.fromProperty(Tab_Table.order_pos).descending()).queryList();
    }
    return tabs;
}