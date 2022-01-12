private void synchronizeHistoryCache(java.util.Set<java.lang.Long> historyCacheUpdateList) {
    if (controller.isHistoryModeEnabled()) {
        cern.c2mon.client.core.tag.CloneableTagBean cdt = null;
        cern.c2mon.client.core.tag.CloneableTagBean historyTag = null;
        for (java.lang.Long tagId : historyCacheUpdateList) {
            cdt = liveCache.get(tagId);
            historyTag.setTagBean(cdt.getTagBean().clone());
            historyCache.put(tagId, historyTag);
        }
        historyCacheUpdateList.clear();
    }
}