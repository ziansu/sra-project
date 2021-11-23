public static void main(java.lang.String[] args) {
    org.apache.log4j.Logger.getLogger("com.intel.bluetooth").setLevel(org.apache.log4j.Level.WARN);
    uk.ac.ed.inf.sdp2012.group7.vision.Vision v = new uk.ac.ed.inf.sdp2012.group7.vision.Vision();
    uk.ac.ed.inf.sdp2012.group7.strategy.Strategy s = new uk.ac.ed.inf.sdp2012.group7.strategy.Strategy();
    uk.ac.ed.inf.sdp2012.group7.ui.ControlGUI gui = new uk.ac.ed.inf.sdp2012.group7.ui.ControlGUI(s);
    gui.initGUI();
}