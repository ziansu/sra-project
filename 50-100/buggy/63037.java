@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    android.view.View rootView = inflater.inflate(R.layout.fragment_ingredient_detail, container, false);
    unbinder = butterknife.ButterKnife.bind(this, rootView);
    ingredientList.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(rootView.getContext(), android.support.v7.widget.LinearLayoutManager.VERTICAL, false));
    com.udacity.willbrom.bakingapp.adapter.IngredientListAdapter adapter = new com.udacity.willbrom.bakingapp.adapter.IngredientListAdapter();
    adapter.setIngredientsModelList(ingredientsModelList);
    ingredientList.setAdapter(adapter);
    return rootView;
}