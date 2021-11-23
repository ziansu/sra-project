public void close() {
    firebase.child(getObjectReference()).removeValue();
}