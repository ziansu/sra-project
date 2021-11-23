@java.lang.Override
public void onActivityCreated(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    android.util.Log.d(com.udacity.bakappies.fragment.FragmentStepDetail.TAG, ("onActivityCreated " + (step.getShortDescription())));
}