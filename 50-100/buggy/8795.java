@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setRetainInstance(true);
    db = new com.nectar.thesun.library.NewsListDatabase(com.nectar.thesun.PageSlidingTabStripFragment.mcontext);
    if ((db.getNews()) != null) {
        com.nectar.thesun.library.MyConstants.homenews = db.getNews();
        com.nectar.thesun.HomeFragment.Setup();
    }
    if (!(com.nectar.thesun.PageSlidingTabStripFragment.isAsyncTaskPendingOrRunning())) {
        loadNewsNow(getActivity());
        com.nectar.thesun.PageSlidingTabStripFragment.mcontext = getActivity().getApplicationContext();
    }
}