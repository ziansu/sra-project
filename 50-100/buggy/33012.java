private android.view.View getGameFragmentLayout(@android.support.annotation.NonNull
final android.support.v4.app.Fragment fragment) {
    android.support.v4.app.FragmentActivity activity = fragment.getActivity();
    java.lang.String format = "The fragment {%s} does not have an activity attached!";
    if (activity == null)
        return logError(format, fragment);
    
    android.support.v4.app.Fragment envelopeFragment = activity.getSupportFragmentManager().findFragmentByTag(mTag);
    format = "The envelope fragment {%s} does not have a layout view!";
    if ((envelopeFragment == null) || ((envelopeFragment.getView()) == null))
        logError(format, envelopeFragment);
    
    return envelopeFragment.getView();
}