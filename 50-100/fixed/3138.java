@java.lang.Override
public void onAppSearchResultLoad(org.iplantc.de.apps.client.events.AppSearchResultLoadEvent event) {
    int total = ((event.getResults()) == null) ? 0 : event.getResults().size();
    setHeadingText(appearance.searchAppResultsHeader(event.getSearchText(), total));
}