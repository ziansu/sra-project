@com.squareup.otto.Subscribe
public void RefreshData(org.fossasia.openevent.events.RefreshUiEvent event) {
    setVisibility(true);
    if ((searchText.length()) == 0) {
        tracksListAdapter.refresh();
    }
}