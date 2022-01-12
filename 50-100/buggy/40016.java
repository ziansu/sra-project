@java.lang.Override
public void onAttach(android.app.Activity activity) {
    super.onAttach(activity);
    try {
        stepItemClickListener = ((com.lee.hansol.bakingtime.adapters.StepsRecyclerViewAdapter.OnStepItemClickListener) (getActivity()));
    } catch (java.lang.ClassCastException e) {
        throw new java.lang.ClassCastException(((getActivity().toString()) + " must implement OnStepItemClickListener"));
    }
}