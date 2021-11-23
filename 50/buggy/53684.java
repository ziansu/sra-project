public void startCounter() {
    java.lang.Thread thread = new java.lang.Thread(new com.example.ninja.bombbob.AccelerationEvent.Timer());
    thread.start();
}