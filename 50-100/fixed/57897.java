@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    connecting = false;
    com.nectar.thesun.PageSlidingTabStripFragment.cd = new com.nectar.thesun.library.ConnectionDetector(getActivity());
    if (com.nectar.thesun.PageSlidingTabStripFragment.cd.isConnectingToInternet()) {
        connecting = true;
        return inflater.inflate(R.layout.pager, container, false);
    }else {
        return inflater.inflate(R.layout.nointernet, container, false);
    }
}