@java.lang.Override
public void onResume() {
    super.onResume();
    android.util.Log.d(com.udacity.bakappies.fragment.FragmentStepDetail.TAG, ("onResume " + (step.getShortDescription())));
    if (getUserVisibleHint()) {
        load(step);
    }
}