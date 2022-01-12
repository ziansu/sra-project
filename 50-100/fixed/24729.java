@java.lang.Override
public void onListItemClick(int clickedItemIndex) {
    if (!(com.sksanwar.bakingapp.Activities.MainActivity.isTablet)) {
        android.content.Intent intent = new android.content.Intent(getActivity(), com.sksanwar.bakingapp.Activities.StepsDetailsActivity.class);
        intent.putParcelableArrayListExtra(RecipeFragment.RECIPE_LIST, stepslist);
        intent.putExtra(RecipeFragment.POSITION, clickedItemIndex);
        startActivity(intent);
    }else {
        android.support.v4.app.FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        com.sksanwar.bakingapp.Fragments.StepsDetailActivityFragment stepsDetailActivityFragment = new com.sksanwar.bakingapp.Fragments.StepsDetailActivityFragment();
        stepsDetailActivityFragment.index = clickedItemIndex;
        fragmentManager.beginTransaction().add(R.id.steps_details_frame, stepsDetailActivityFragment).commit();
    }
}