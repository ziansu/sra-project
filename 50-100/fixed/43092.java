public boolean askPermission(simulator.PlaneThread plane) {
    boolean ret;
    if (((activePlaneList.size()) == 0) && ((freeLaneList = domain.dao.HibernateGeneric.getFreeLanes()) != null)) {
        plane.setLane(freeLaneList.get(0));
        ret = true;
    }else {
        activePlaneList.add(plane);
        ret = false;
    }
    return ret;
}