@java.lang.Override
public void onAttach(android.app.Activity activity) {
    super.onAttach(activity);
    try {
        stepItemClickListener = ((com.lee.hansol.bakingtime.adapters.StepsRecyclerViewAdapter.OnStepItemClickListener) (activity));
    } catch (java.lang.ClassCastException e) {
        throw new java.lang.ClassCastException(((activity.toString()) + " must implement OnStepItemClickListener"));
    }
}