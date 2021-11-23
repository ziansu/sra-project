public void removeTileTabKey(mapEditor.application.main_part.app_utils.models.TabKey key) {
    if ((key != null) && (openedTileTabs.containsKey(key)))
        openedTileTabs.remove(key);
    
}