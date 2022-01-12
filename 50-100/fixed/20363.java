@java.lang.Override
public void mouseDragged(java.awt.event.MouseEvent e) {
    try {
        if (!(max)) {
            java.awt.Point newlocation = e.getLocationOnScreen();
            setLocation(((newlocation.x) - (com.hackathon.ping.PingMainFrame.mousePoint.x)), ((newlocation.y) - (com.hackathon.ping.PingMainFrame.mousePoint.y)));
        }else {
            return ;
        }
    } catch (java.lang.Exception x) {
        java.lang.System.out.println(x.getMessage());
    }
}