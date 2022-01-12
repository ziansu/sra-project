@java.lang.Override
public void setFeedbackMode(int mode) throws java.lang.IllegalArgumentException {
    jmri.jmrix.tams.TamsTurnout.log.debug("*** setFeedbackMode ***");
    jmri.jmrix.tams.TamsMessage m = new jmri.jmrix.tams.TamsMessage((("xT " + (_number)) + ",,1"));
    if (mode == (MONITORING)) {
        tc.sendTamsMessage(m, this);
    }
    super.setFeedbackMode(mode);
}