@java.lang.Override
public void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    audioVisualization.linkTo(DbmHandler.Factory.newVisualizerHandler(getContext(), 0));
    viewPager.setCurrentItem(mPreferences.getStartPageIndex());
}