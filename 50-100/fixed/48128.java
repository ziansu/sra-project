@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    eu.davidea.flipview.FlipView.resetLayoutAnimationDelay(true, 1000L);
    if (savedInstanceState == null) {
        eu.davidea.samples.flexibleadapter.services.DatabaseService.getInstance().createEndlessDatabase(0);
    }
    initializeRecyclerView();
    eu.davidea.flipview.FlipView.stopLayoutAnimation();
}