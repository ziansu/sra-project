@java.lang.Override
public void onLoaded(java.util.List<com.anhhoang.picrust.data.models.RecipeModel> result) {
    if ((result != null) && ((result.size()) > 0)) {
        recipesLocalDataSource.save(result.toArray(new com.anhhoang.picrust.data.models.RecipeModel[result.size()]));
        callback.onLoaded(result);
    }else {
        callback.onDataNotAvailable();
    }
}