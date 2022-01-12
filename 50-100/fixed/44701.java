private void startUpdatingCategoryList() {
    if ((lastUpdater) != null) {
        lastUpdater.cancel(true);
    }
    if ((methodAUpdater) != null) {
        methodAUpdater.cancel(true);
    }
    methodAUpdater = new fr.free.nrw.commons.category.CategorizationFragment.MethodAUpdater();
    lastUpdater = new fr.free.nrw.commons.category.CategorizationFragment.CategoriesUpdater();
    fr.free.nrw.commons.Utils.executeAsyncTask(lastUpdater);
    fr.free.nrw.commons.Utils.executeAsyncTask(methodAUpdater);
}