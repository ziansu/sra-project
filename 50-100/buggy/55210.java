public void addSearchData(java.lang.Object searchData) {
    if (searchData != null) {
        com.google.gwt.user.client.Window.alert(("Received search results!: \n" + (searchData.toString())));
        searchResultsStore = new com.extjs.gxt.ui.client.store.ListStore<org.sigmah.shared.dto.search.SearchResultsDTO>();
        for (java.lang.Object object : ((java.util.ArrayList) (searchData))) {
            searchResultsStore.add((object != null ? ((org.sigmah.shared.dto.search.SearchResultsDTO) (object)) : null));
        }
    }else {
        com.google.gwt.user.client.Window.alert("Failed to receive search results!");
    }
}