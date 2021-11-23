private void fireOnPositionReceived(com.embedded.socialexercise.person.Person person) {
    android.util.Log.i("MQTT", "Got Position");
    for (com.embedded.socialexercise.events.OnPositionReceivedListener listener : listenersPos) {
        try {
            listener.positionRecieved(person);
        } catch (java.lang.Exception e) {
            android.util.Log.e("MQTT", e.getMessage());
        }
    }
}