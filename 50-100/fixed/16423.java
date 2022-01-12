@java.lang.Override
public android.view.View onCreateView(final android.view.LayoutInflater inflater, final android.view.ViewGroup container, final android.os.Bundle savedInstanceState) {
    final android.view.View view = inflater.inflate(R.layout.grid_view_fragment, container, false);
    recipes = filterRecipes(chosenCategoryID);
    getActivity().setTitle(bubbleheads.buy_cook.CategoryList.getInstance().getCategory(chosenCategoryID).getName());
    setUpCollection(view);
    setHasOptionsMenu(true);
    ((android.support.v7.app.AppCompatActivity) (getActivity())).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    return view;
}