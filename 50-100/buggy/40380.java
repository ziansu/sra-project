public com.google.gwt.user.client.ui.VerticalPanel gibFilterPanel() {
    com.google.gwt.user.client.ui.VerticalPanel vpFilterPanel = new com.google.gwt.user.client.ui.VerticalPanel();
    vpFilterPanel.add(nuCL.generiereCellList(CellListModus.Nachrichtenuebersicht, 0));
    vpFilterPanel.add(hsCL.generiereCellList(CellListModus.Nachrichtenuebersicht, 0));
    com.google.gwt.user.client.ui.Button btnFilterZuruecksetzen = new com.google.gwt.user.client.ui.Button("Filter zurücksetzen");
    btnFilterZuruecksetzen.setStylePrimaryName("filterBtn");
    btnFilterZuruecksetzen.addClickHandler(new com.google.gwt.event.dom.client.ClickHandler() {
        @java.lang.Override
        public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
            de.hdm.tellme.client.gui.editor.NeuigkeitenNachrichtenBaumModel.setzeKeinenFilter();
        }
    });
    vpFilterPanel.add(btnFilterZuruecksetzen);
    return vpFilterPanel;
}