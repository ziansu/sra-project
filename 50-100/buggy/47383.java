@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    switch (parent.getId()) {
        case R.id.spinnerKontotyp :
            java.lang.String klartext = ((java.lang.String) (parent.getItemAtPosition(position)));
            kt = de.aw.enums.Kontotyp.convertKlartext(klartext);
            gv.put(R.string.column_accounttyp, kt.name());
            gv.put(R.string.column_tablename, kt.zielTabelle.ordinal());
            checkKontoTyp();
    }
}