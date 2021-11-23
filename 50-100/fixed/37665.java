@java.lang.Override
public void OnGet(java.util.List<com.exemple.android.cookbook.entity.StepRecipe> stepRecipes) {
    mStepRecipe = stepRecipes;
    updateData(mIndex);
    if (mStepRecipe.isEmpty()) {
        android.widget.Toast.makeText(mContext, getResources().getString(R.string.no_information_available), Toast.LENGTH_SHORT).show();
    }
}