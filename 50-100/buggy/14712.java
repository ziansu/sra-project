public Lane shorter() {
    if ((Road.lanes[1].getLength()) > (Road.lanes[2].getLength())) {
        return Road.lanes[1];
    }else
        if ((Road.lanes[1].getLength()) < (Road.lanes[2].getLength())) {
            return Road.lanes[2];
        }else {
            return Road.lanes[(((int) ((java.lang.Math.random()) * 2)) + 1)];
        }
    
}