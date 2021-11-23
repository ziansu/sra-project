private void selectNextCamera(us.mn.state.dot.tms.server.comm.Operation op) {
    int uid = getCamNumber();
    if (uid > 0) {
        us.mn.state.dot.tms.Camera c = us.mn.state.dot.tms.CameraHelper.findNext(uid);
        if (c instanceof us.mn.state.dot.tms.server.CameraImpl) {
            us.mn.state.dot.tms.server.VideoMonitorImpl.setCameraNotify(getMonNumber(), ((us.mn.state.dot.tms.server.CameraImpl) (c)), ("NEXT " + op));
        }
    }
}