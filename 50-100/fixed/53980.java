@java.lang.Override
public void onBindViewHolder(com.example.android.bakingapp.Adapters.RecipeAdapter.RecipeViewHolder holder, int position) {
    java.lang.String recipeName = mRecipeList.get(position).name;
    java.lang.String servingsNumber = java.lang.Integer.toString(mRecipeList.get(position).servings);
    java.lang.String stepsNumber = java.lang.Integer.toString(mRecipeList.get(position).stepsList.size());
    holder.mTextViewRecipeName.setText(recipeName);
    holder.mTextViewServings.setText(servingsNumber);
    holder.mTextViewStepsNumber.setText(stepsNumber);
}