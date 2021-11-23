public void findFastest() {
    double fastest = 0.0;
    int index = 0;
    for (int i = 0; i < (fleet.length); i++) {
        if ((fleet[i].getTopSpeedMach()) > fastest) {
            fastest = fleet[i].getTopSpeedMach();
            index = i;
        }
    }
    java.lang.System.out.println("This is the fastest jet in the fleet: ");
    java.lang.System.out.println(fleet[index]);
}