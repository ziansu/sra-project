@java.lang.Override
public void run() {
    Airport.getRunways().offer(runway);
    runway.stopUse();
    Airport.getLandedQueue().offer(this);
    Airport.getAirTrafficController().signalLanded();
    java.lang.System.out.println((((name) + " landed. Time: ") + (Airport.getCurrentSimulationTime())));
    landingTimer.cancel();
}