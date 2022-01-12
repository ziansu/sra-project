@java.lang.Override
public void subscribe(@io.reactivex.annotations.NonNull
io.reactivex.ObservableEmitter<android.net.Uri> e) throws java.lang.Exception {
    for (int i = 0; i < (recipes.size()); i++) {
        com.irfankhoirul.recipe.data.pojo.Recipe recipe = recipes.get(i);
        insertSingleRecipe(e, recipe);
    }
    e.onComplete();
}