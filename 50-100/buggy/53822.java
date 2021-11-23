@java.lang.Override
public void restaurantAdded(java.lang.String rId) {
    android.util.Log.d("restaurant added", ("Rid: " + rId));
    newpostFragment = new in.foodtalk.android.fragment.newpost.CheckIn();
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putString("rId", rId);
    newpostFragment.setArguments(bundle);
    setFragmentView(newpostFragment, R.id.container1, 0, true);
}