public void setMannschaft(int id) {
    mannschaftID = id;
    mannschaft = mannschaften[((mannschaftID) - 1)];
    jLblMannschaftsname.setText(mannschaft.getName());
    if (hasGrDatum) {
        jLblGruendungsdatum.setText(("Gegründet: " + (mannschaft.getGruendungsdatum())));
        jLblGruendungsdatum.setVisible(true);
    }
    newKader();
    labelsBefuellen();
    showStatistics();
    showTableExcerpt();
}