@java.lang.Override
public void done(com.parse.ParseException e) {
    if (e == null)
        android.util.Log.d("DEBUG", "Successfully created event on Parse");
    
    android.support.design.widget.Snackbar snackbar = android.support.design.widget.Snackbar.make(view, "    Event created Successfully!!", Snackbar.LENGTH_LONG).setActionTextColor(getResources().getColor(R.color.accent));
    snackbar.show();
    com.codepath.qzineat.fragments.HostListFragment hostListFragment = new com.codepath.qzineat.fragments.HostListFragment();
    android.support.v4.app.FragmentTransaction transaction = getFragmentManager().beginTransaction();
    transaction.replace(R.id.flContent, hostListFragment);
    transaction.commit();
}