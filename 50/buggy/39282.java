@java.lang.Override
public com.example.android.bakingapp.Adapters.RecipeAdapter.RecipeViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View view = mInflater.inflate(R.layout.recipe_item, parent);
    return new com.example.android.bakingapp.Adapters.RecipeAdapter.RecipeViewHolder(view);
}