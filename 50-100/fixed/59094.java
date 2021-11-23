private void restoreDataFragment() {
    dataFragment = ((ch.unibe.scg.zeeguuu.Core.DataFragment) (fragmentManager.findFragmentByTag("data")));
    if ((dataFragment) != null)
        dataFragment.onRestore(this);
    else {
        dataFragment = new ch.unibe.scg.zeeguuu.Core.DataFragment();
        addFragment(dataFragment, "data");
        dataFragment.setConnectionManager(new ch.unibe.zeeguulibrary.Core.ZeeguuConnectionManager(this));
    }
}