@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    eu.davidea.flipview.FlipView.resetLayoutAnimationDelay(true, 1000L);
    eu.davidea.samples.flexibleadapter.services.DatabaseService.getInstance().createEndlessDatabase(100);
    initializeRecyclerView(savedInstanceState);
    eu.davidea.flipview.FlipView.stopLayoutAnimation();
}