@java.lang.Override
public void onClick(android.view.View v) {
    com.dqhuynh.gplace.fragment.SearchFragment.selectedPlaceTypes.remove(v.getTag());
    v.setVisibility(View.GONE);
}