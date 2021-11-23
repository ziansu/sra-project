@java.lang.Override
public void onListItemClick(android.widget.ListView l, android.view.View v, int position, long id) {
    com.luxary_team.simpleeat.Recipe.RecipeType recipeType = ((com.luxary_team.simpleeat.Recipe.RecipeType) (getListAdapter().getItem(position)));
    android.util.Log.d(MainActivity.TAG, ("on item click " + position));
    com.luxary_team.simpleeat.RecipeListFragment recipeListFragment = ((com.luxary_team.simpleeat.RecipeListFragment) (com.luxary_team.simpleeat.RecipeListFragment.newInstance(recipeType)));
    getFragmentManager().beginTransaction().replace(R.id.content_frame, recipeListFragment).addToBackStack(null).commit();
}