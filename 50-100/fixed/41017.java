@java.lang.Override
public void onItemClicked(android.support.v7.widget.RecyclerView recyclerView, int position, android.view.View v) {
    tech.town.app.com.apptowntech.utils.Navigation.launchDescription(getActivity(), homeCategoryList.get(0).getCId(), homeCategoryList.get(0).getCPost().get((position - 1)).getPId(), homeCategoryList.get(0).getCName());
}