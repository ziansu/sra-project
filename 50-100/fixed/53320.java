@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    android.util.Log.v(net.hokiegeek.android.dondeestas.MainActivity.TAG, ("Location: " + (location.toString())));
    android.widget.Toast.makeText(this, net.hokiegeek.android.dondeestas.Util.LocationToPosition(location).toString(), Toast.LENGTH_SHORT).show();
    user.setPosition(net.hokiegeek.android.dondeestas.Util.LocationToPosition(location));
    dataModel.updatePerson(user.getPerson());
}