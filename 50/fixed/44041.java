@java.lang.Override
public void call(android.location.Location location) {
    this.location = location;
    fragment.setAdapterLocation(location);
}