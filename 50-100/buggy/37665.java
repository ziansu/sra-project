@java.lang.Override
public void OnGet(java.util.List<com.exemple.android.cookbook.entity.StepRecipe> stepRecipes) {
    if ((mStepRecipe.size()) != 0) {
        updateData(mIndex);
    }else {
        android.widget.Toast.makeText(mContext, getResources().getString(R.string.no_information_available), Toast.LENGTH_SHORT).show();
    }
}