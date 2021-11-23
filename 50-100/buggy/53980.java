@java.lang.Override
public void onBindViewHolder(com.example.android.bakingapp.Adapters.RecipeAdapter.RecipeViewHolder holder, int position) {
    java.lang.String recipeName = mRecipeList.get(position).name;
    int servingsNumber = mRecipeList.get(position).servings;
    int stepsNumber = mRecipeList.get(position).stepsList.size();
    holder.mTextViewRecipeName.setText(recipeName);
    holder.mTextViewServings.setText(servingsNumber);
    holder.mTextViewStepsNumber.setText(stepsNumber);
}