@java.lang.Override
public void onPause() {
    super.onPause();
    android.util.Log.d(com.udacity.bakappies.fragment.FragmentStepDetail.TAG, ("onPause " + (step.getShortDescription())));
}