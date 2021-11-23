public static android.content.Intent getIntent(android.content.Context context, com.jacquessmuts.bakingforudacity.Models.Recipe recipe, com.jacquessmuts.bakingforudacity.Models.Step step) {
    android.content.Intent intent = new android.content.Intent(context, com.jacquessmuts.bakingforudacity.Activities.StepDetailActivity.class);
    intent.putExtra(com.jacquessmuts.bakingforudacity.Activities.RecipeDetailActivity.EXTRA_RECIPE, recipe);
    intent.putExtra(com.jacquessmuts.bakingforudacity.Activities.RecipeDetailActivity.EXTRA_STEP_INDEX, recipe.getSteps().indexOf(step));
    return intent;
}