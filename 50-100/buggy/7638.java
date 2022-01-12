@java.lang.Override
public void onClick(android.view.View v) {
    mAddFAB.setVisibility(View.INVISIBLE);
    mAddDialog = new org.jasey.unforgetit.fragment.AddTaskDialogFragment();
    getSupportFragmentManager().beginTransaction().setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).replace(R.id.unforget_it_activity, mAddDialog).addToBackStack(null).commit();
    mPagerAdapter.notifyDataSetChanged();
}