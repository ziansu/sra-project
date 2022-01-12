private void handleBlobStoreNotifyOptimizations(com.gigaspaces.internal.server.storage.NotifyTemplateHolder template, boolean register) {
    if ((!(_cacheManager.isOffHeapCachePolicy())) || (!(template.containsNotifyType(NotifyActionType.NOTIFY_TAKE))))
        return ;
    
    if (!register) {
        if (!(anyDurableNotifyTakeTemplates()))
            _unallowedClearTakeOptimizationsBlobStore.clear();
        
    }else
        setBlobStoreClearTakeOptimizationNotAllowed(template.getClassName());
    
}