private void endTrip() {
    if ((dbHelper) != null)
        obd2.dhbw.de.obd2_reader.util.TripCalculator.calculate(dbHelper, tripId);
    
    if ((adapterAgent) != null)
        adapterAgent.stop();
    
    if ((compass) != null)
        compass.stop();
    
    try {
        if ((socket) != null)
            socket.close();
        
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}