@java.lang.Override
public void run() {
    while (true) {
        if (((activePlaneList.size()) > 0) && ((freeLaneList = domain.dao.HibernateGeneric.getFreeLanes(1)) != null)) {
            simulator.PlaneThread plane = activePlaneList.get(0);
            plane.setLane(freeLaneList.get(0));
            activePlaneList.remove(plane);
            plane.givePermission();
        }
    } 
}