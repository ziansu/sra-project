private void ReloadViews() {
    Adapter.notifyDataSetChanged();
    for (java.lang.String s : v6.caique.ExploreFragment.ChatIDs) {
        if ((v6.caique.ExploreFragment.Chats.get(s).DataQuery) != null) {
            v6.caique.ExploreFragment.Chats.get(s).DataQuery.removeEventListener(v6.caique.ExploreFragment.Chats.get(s).DataListener);
        }
    }
}