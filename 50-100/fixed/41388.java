@java.lang.Override
public void done(com.parse.ParseException e) {
    if (e == null)
        android.util.Log.d("DEBUG", "Successfully created event on Parse");
    
    com.codepath.qzineat.fragments.HostListFragment hostListFragment = new com.codepath.qzineat.fragments.HostListFragment();
    android.support.v4.app.FragmentTransaction transaction = getFragmentManager().beginTransaction();
    transaction.replace(R.id.flContent, hostListFragment);
    transaction.commit();
}