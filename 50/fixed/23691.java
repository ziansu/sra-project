public int size() {
    if (isMapInitialized) {
        return (topLevelMap.size()) - 1;
    }
    return resourceBundle.keySet().size();
}