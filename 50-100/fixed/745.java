@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    if ((tripList.size()) > 0) {
        com.grp10.codepath.travelmemo.firebase.Trip trip = tripList.get(position);
        return com.grp10.codepath.travelmemo.fragments.OverlapFragment.newInstance(com.grp10.codepath.travelmemo.data.DemoImages.covers[(position % 6)], trip.getName(), trip.getDescription(), trip.getId());
    }else {
        return new com.grp10.codepath.travelmemo.fragments.OverlapFragment();
    }
}