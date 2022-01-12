@java.lang.Override
public void onClick(android.view.View v) {
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putString("objectId", event.getHost().getObjectId());
    com.codepath.qzineat.fragments.ProfileFragment profileFragment = new com.codepath.qzineat.fragments.ProfileFragment();
    android.support.v4.app.FragmentTransaction transaction = getFragmentManager().beginTransaction();
    transaction.addToBackStack(null);
    profileFragment.setArguments(bundle);
    transaction.replace(R.id.flContent, profileFragment);
    transaction.commit();
}