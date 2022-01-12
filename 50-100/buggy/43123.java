private void endTrip() {
    obd2.dhbw.de.obd2_reader.util.TripCalculator.calculate(dbHelper, tripId);
    adapterAgent.stop();
    compass.stop();
    try {
        socket.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}