@java.lang.Override
public void run() {
    for (double d = currentTemperature.getMeasure_Double(); (currentTemperature.getMeasure_Double()) > (desiredTemperature.getMeasure_Double()); d--) {
        HeizungServer.MeasureBean new_currentTemperature = new HeizungServer.MeasureBean(d, currentTemperature.getUnitOfMeasurement_Enum());
        setCurrentTemperature(new_currentTemperature);
        notifyObservers(desiredTemperature);
        try {
            java.lang.Thread.sleep(500);
        } catch (java.lang.InterruptedException e) {
            java.lang.System.out.print(e.toString());
        }
    }
}