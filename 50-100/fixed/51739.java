@java.lang.Override
public void enter(final com.vaadin.navigator.ViewChangeListener.ViewChangeEvent event) {
    try {
        elencoMissioniTable.aggiornaTableAdmin(it.cnr.missioni.dashboard.client.ClientConnector.getMissione(it.cnr.missioni.el.model.search.builder.MissioneSearchBuilder.getMissioneSearchBuilder()));
        elencoRimborsiTable.aggiornaTableAdmin(it.cnr.missioni.dashboard.client.ClientConnector.getMissione(it.cnr.missioni.el.model.search.builder.MissioneSearchBuilder.getMissioneSearchBuilder().withFieldExist(SearchConstants.MISSIONE_FIELD_RIMBORSO)));
    } catch (java.lang.Exception e) {
        it.cnr.missioni.dashboard.utility.Utility.getNotification(it.cnr.missioni.dashboard.utility.Utility.getMessage("error_message"), it.cnr.missioni.dashboard.utility.Utility.getMessage("request_error"), Type.ERROR_MESSAGE);
    }
}