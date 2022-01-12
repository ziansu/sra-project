@java.lang.Override
public void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder holder, int position) {
    switch (getItemViewType(position)) {
        case INGREDIENTS :
            fillIngredients(mIngredientsData, ((io.liney.bakingapp.StepAdapter.IngredientViewHolder) (holder)));
            break;
        case STEPS :
            java.lang.String shortDescription = mStepsData.get(position).getShortDescription();
            ((io.liney.bakingapp.StepAdapter.StepViewHolder) (holder)).mShortDescriptionTextView.setText(shortDescription);
            break;
    }
}