public void doAction(int speedOfTravel, java.lang.String timeOfDeath) {
    java.lang.String searchRadius = cit260.murderInTheCity.control.CaseControl.calculateSearchRadius(speedOfTravel, timeOfDeath);
    java.lang.System.out.println(searchRadius);
}