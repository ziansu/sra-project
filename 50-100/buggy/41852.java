private void SwitchToCreateJoinFragment(int actionCode) {
    if (Utils.CommonUtil.GetIsApplicationRunningInForeground(this)) {
        if ((createJoinFragment) == null)
            createJoinFragment = new Fragments.CreateJoinGroupFragment();
        
        createJoinFragment.SetAction(actionCode);
        android.support.v4.app.FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fl_fragments_container, createJoinFragment);
        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        transaction.addToBackStack("createJoin");
        transaction.commit();
        SetFabsVisible(false);
        currentFragmentID = FRAGMENT_ID_JOINCREATE;
    }else
        ScheduleSwitchToFragment(FRAGMENT_ID_JOINCREATE, actionCode);
    
}