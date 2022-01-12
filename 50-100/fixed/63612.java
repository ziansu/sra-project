@java.lang.Override
public void run() {
    try {
        trafficLightsView.changeLight(TrafficLightsView.Light.RED);
        java.lang.Thread.sleep(this.offset);
        while (!(java.lang.Thread.interrupted())) {
            trafficLightsView.changeLight(TrafficLightsView.Light.GREEN);
            java.lang.Thread.sleep(greenLightDuration);
            trafficLightsView.changeLight(TrafficLightsView.Light.RED);
            java.lang.Thread.sleep(redLightDuration);
        } 
    } catch (java.lang.InterruptedException ex) {
        trafficLightsView.changeLight(TrafficLightsView.Light.RED);
        java.lang.System.out.println("Traffic lights modelling stopped.");
    }
}