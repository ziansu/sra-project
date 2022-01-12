private void fireOnPositionReceived(com.google.android.gms.maps.model.LatLng p, java.lang.String id, com.embedded.socialexercise.person.Person person) {
    android.util.Log.i("MQTT", "Got Position");
    for (com.embedded.socialexercise.events.OnPositionReceivedListener listener : listenersPos) {
        try {
            listener.positionRecieved(p, id, person);
        } catch (java.lang.Exception e) {
            android.util.Log.e("MQTT", e.getMessage());
        }
    }
}