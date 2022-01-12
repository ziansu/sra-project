public void updateBothTabs(android.os.Bundle bundle) {
    edu.cmu.cylab.starslinger.view.ThreadsFragment frag = ((edu.cmu.cylab.starslinger.view.ThreadsFragment) (getChildFragmentManager().findFragmentByTag(Tabs.THREADS.toString())));
    if (frag != null) {
        frag.updateValues(bundle);
    }
    edu.cmu.cylab.starslinger.view.MessagesFragment msgFrag = ((edu.cmu.cylab.starslinger.view.MessagesFragment) (getChildFragmentManager().findFragmentByTag(Tabs.MESSAGE.toString())));
    if (msgFrag != null) {
        msgFrag.updateValues(bundle);
    }
}