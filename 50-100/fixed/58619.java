@java.lang.Override
public void onDataNotAvailable(java.lang.Object additionalInfo) {
    com.anhhoang.picrust.ui.recipes.RecipeErrorEnum recipeErrorEnum = RecipeErrorEnum.EMPTY;
    if (additionalInfo == null) {
        recipeErrorEnum = RecipeErrorEnum.EMPTY;
    }else
        if (additionalInfo instanceof java.lang.Integer) {
            recipeErrorEnum = RecipeErrorEnum.OTHER;
        }else
            if (additionalInfo instanceof java.lang.Throwable) {
                recipeErrorEnum = RecipeErrorEnum.NETWORK;
            }
        
    
    view.showLoadingIndicator(false);
    view.showErrorView(true, recipeErrorEnum);
}