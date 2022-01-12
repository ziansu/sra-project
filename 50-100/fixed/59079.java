@java.lang.Override
public void onAttach(android.content.Context activity) {
    super.onAttach(activity);
    link = getArguments().getString(AppState.KEY_ARGS);
    linkPts = link.split("/");
    try {
        callbacks = ((com.untappedkegg.rally.stages.ExpandableStagesFragment.Callbacks) (activity));
    } catch (java.lang.ClassCastException e) {
        throw new java.lang.ClassCastException((((activity.toString()) + " must implement ") + (com.untappedkegg.rally.stages.ExpandableStagesFragment.Callbacks.class.getSimpleName())));
    }
}