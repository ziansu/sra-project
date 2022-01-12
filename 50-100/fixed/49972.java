@java.lang.Override
public void onLoaderComplete(com.github.a2g.core.objectmodel.LoaderItem loader) {
    java.lang.String loaderName = loader.toString();
    setOfCompletedLoaders.add(loaderName);
    com.github.a2g.core.objectmodel.LoadedLoad cachedCollection = loader.getSceneObjectCollection();
    java.lang.String combinedName = loader.getCombinedClassAndNumber();
    assert combinedName != null;
    assert cachedCollection != null;
    objectCache.put(combinedName, cachedCollection);
    master.mergeWithScene(cachedCollection);
    if (!(listOfEssentialLoaders.isEmpty())) {
        this.listOfEssentialLoaders.remove(0);
    }
    loadNext();
}