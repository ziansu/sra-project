@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    eu.davidea.flipview.FlipView.resetLayoutAnimationDelay(true, 1000L);
    if ((eu.davidea.samples.flexibleadapter.services.DatabaseService.getInstance().getDatabaseList().size()) == 0) {
        eu.davidea.samples.flexibleadapter.services.DatabaseService.getInstance().createEndlessDatabase(0);
    }
    initializeRecyclerView();
    eu.davidea.flipview.FlipView.stopLayoutAnimation();
}