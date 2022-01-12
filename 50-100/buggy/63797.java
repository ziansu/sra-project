@java.lang.Override
public void onLoaded(java.util.List<com.anhhoang.picrust.data.models.RecipeModel> result) {
    if ((result != null) && ((result.size()) > 0)) {
        callback.onLoaded(result);
        recipesLocalDataSource.save(result.toArray(new com.anhhoang.picrust.data.models.RecipeModel[result.size()]));
    }else {
        callback.onDataNotAvailable();
    }
}