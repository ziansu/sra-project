@java.lang.Override
protected void onResume() {
    super.onResume();
    io.realm.RealmResults<com.simopuve.model.PDVRow> all = realm.where(com.simopuve.model.PDVRow.class).equalTo("rowNumber", position).findAll();
    if (!(all.isEmpty())) {
        survey.getRows().clear();
        io.realm.RealmList rows = survey.getRows();
        rows.addAll(all);
        survey.setRows(rows);
    }
    adapter.notifyDataSetChanged();
}