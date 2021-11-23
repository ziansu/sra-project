public void normalizeRatio(sdp.AI.Command comm) {
    if ((java.lang.Math.abs(comm.turning_speed)) > (MAX_TURNING_SPEED)) {
        comm.speed = MAX_SPEED_CM_S;
        return ;
    }
    double rat = 1 - ((java.lang.Math.abs(comm.turning_speed)) / (MAX_SPEED_CM_S));
    comm.speed *= rat;
}