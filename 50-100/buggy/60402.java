public org.opensky.libadsb.Position decodePosition(double time, org.opensky.libadsb.Position receiver, org.opensky.libadsb.msgs.SurfacePositionMsg msg) {
    org.opensky.libadsb.Position ret = decodePosition(time, msg);
    if ((ret != null) && (receiver != null)) {
        ret.setReasonable(((ret.isReasonable()) && (org.opensky.libadsb.PositionDecoder.withinReasonableRange(receiver, ret))));
        num_reasonable = 0;
    }
    return ret;
}