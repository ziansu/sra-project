private void ReloadViews(java.lang.String s) {
    Adapter.notifyDataSetChanged();
    if ((v6.caique.ExploreFragment.Chats.get(s).DataQuery) != null) {
        v6.caique.ExploreFragment.Chats.get(s).DataQuery.removeEventListener(v6.caique.ExploreFragment.Chats.get(s).DataListener);
    }
}