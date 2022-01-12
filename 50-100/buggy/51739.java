@java.lang.Override
public void enter(final com.vaadin.navigator.ViewChangeListener.ViewChangeEvent event) {
    try {
        it.cnr.missioni.el.model.search.builder.MissioneSearchBuilder missioneSearchBuilder = it.cnr.missioni.el.model.search.builder.MissioneSearchBuilder.getMissioneSearchBuilder();
        it.cnr.missioni.rest.api.response.missione.MissioniStore missioniStore = it.cnr.missioni.dashboard.client.ClientConnector.getMissione(missioneSearchBuilder);
        elencoMissioniTable.aggiornaTableAdmin(missioniStore);
        missioneSearchBuilder = it.cnr.missioni.el.model.search.builder.MissioneSearchBuilder.getMissioneSearchBuilder().withFieldExist(SearchConstants.MISSIONE_FIELD_RIMBORSO);
        elencoRimborsiTable.aggiornaTableAdmin(missioniStore);
    } catch (java.lang.Exception e) {
        it.cnr.missioni.dashboard.utility.Utility.getNotification(it.cnr.missioni.dashboard.utility.Utility.getMessage("error_message"), it.cnr.missioni.dashboard.utility.Utility.getMessage("request_error"), Type.ERROR_MESSAGE);
    }
}