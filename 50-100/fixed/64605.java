@java.lang.Override
public void onAttach(android.app.Activity activity) {
    super.onAttach(activity);
    try {
        mPlacesListDataPassListener = ((com.dominika.florczykowska.placesfinder.fragments.MapListFragment.PlacesListDataPassListener) (activity));
    } catch (java.lang.ClassCastException e) {
        throw new java.lang.ClassCastException(((activity.toString()) + " must implement PlacesListDataPassListener"));
    }
}