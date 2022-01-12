private void selectCamera(us.mn.state.dot.tms.server.comm.Operation op, int cam) {
    us.mn.state.dot.tms.Camera c = findCam(cam);
    if (c instanceof us.mn.state.dot.tms.server.CameraImpl) {
        us.mn.state.dot.tms.server.VideoMonitorImpl.setCameraNotify(getMonNumber(), ((us.mn.state.dot.tms.server.CameraImpl) (c)), ("SELECT " + (op.getId())));
    }
}