public static us.mn.state.dot.tms.Camera findFirst() {
    us.mn.state.dot.tms.Camera cam = null;
    java.lang.Integer n = null;
    java.util.Iterator<us.mn.state.dot.tms.Camera> it = us.mn.state.dot.tms.CameraHelper.iterator();
    while (it.hasNext()) {
        us.mn.state.dot.tms.Camera c = it.next();
        java.lang.Integer cn = c.getCamNum();
        if (((cn != null) && (n != null)) && (cn < n)) {
            cam = c;
            n = cn;
        }
    } 
    return cam;
}