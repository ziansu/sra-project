@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setRetainInstance(true);
    if ((com.nectar.thesun.library.MyConstants.homenews) == null) {
        com.nectar.thesun.library.MyConstants.homenews = new java.util.ArrayList<>();
    }
    if (!(com.nectar.thesun.PageSlidingTabStripFragment.isAsyncTaskPendingOrRunning())) {
        com.nectar.thesun.PageSlidingTabStripFragment.mcontext = getActivity().getApplicationContext();
        loadNewsNow(getActivity());
    }
}