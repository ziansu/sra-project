public void remove(int position) {
    android.util.Pair<nl.eduvpn.app.entity.Instance, nl.eduvpn.app.entity.Profile> item = _profileList.get(position);
    if (_itemsPendingRemoval.contains(item)) {
        _itemsPendingRemoval.remove(item);
    }
    if (_profileList.contains(item)) {
        _profileList.remove(position);
        _historyService.removeDiscoveredAPI(item.first.getSanitizedBaseURI());
        _historyService.removeSavedProfilesForInstance(item.first.getSanitizedBaseURI());
        _historyService.removeAccessTokens(item.first);
        notifyItemRemoved(position);
    }
}