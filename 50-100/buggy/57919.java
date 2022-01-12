public void setCacheData(java.util.List<dong.lan.lablibrary.model.Asset> assets) {
    if ((data) == null)
        data = new java.util.ArrayList<>();
    
    if (!(cache.isEmpty()))
        cache.clear();
    
    cache.addAll(assets);
    isMainData = false;
    adapter.notifyDataSetChanged();
}