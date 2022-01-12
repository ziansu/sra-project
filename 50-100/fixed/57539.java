@java.lang.Override
public void onAttach(net.citizensnpcs.api.ai.AI ai) {
    this.ai = ai;
    executing = false;
    currentIndex = -1;
    cycle();
    if ((currentIndex) != (-1)) {
        ai.setDestination(waypoints.get(currentIndex).getLocation());
    }
}