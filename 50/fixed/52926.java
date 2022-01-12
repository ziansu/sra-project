public void mouseClicked(java.awt.event.MouseEvent evt) {
    int index = teamIndices[x];
    jBtnChangeTableType(model.Tabellenart.COMPLETE);
    if (belongsToALeague)
        jCBMatchdays.setSelectedIndex(competition.getCurrentMatchday());
    
    model.Start.getInstance().uebersichtAnzeigen(index);
}