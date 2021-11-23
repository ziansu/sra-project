@java.lang.Override
public void onClick(android.view.View v) {
    submitRating(mRatingBar.getRating(), mComment.getText().toString());
    ((com.mmm.parq.activities.DriverActivity) (getActivity())).setState(DriverHomeFragment.State.FIND_SPOT);
    com.mmm.parq.fragments.DriverHomeFragment driverHomeFragment = new com.mmm.parq.fragments.DriverHomeFragment();
    mCallback.setFragment(driverHomeFragment);
    android.support.v4.app.FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
    fragmentTransaction.replace(R.id.container, driverHomeFragment);
    fragmentTransaction.commit();
}