@java.lang.Override
public void releaseThrottle(jmri.DccThrottle t, jmri.ThrottleListener l) {
    jmri.jmrix.loconet.LnThrottleManager.log.debug("releaseThrottle - throttle {}", t.getLocoAddress());
    if (t instanceof jmri.jmrix.loconet.LocoNetThrottle) {
        jmri.jmrix.loconet.LocoNetThrottle lnt = ((jmri.jmrix.loconet.LocoNetThrottle) (t));
        jmri.jmrix.loconet.LocoNetSlot tSlot = lnt.getLocoNetSlot();
        if (tSlot != null) {
            tc.sendLocoNetMessage(tSlot.writeStatus(LnConstants.LOCO_COMMON));
        }
    }
    super.releaseThrottle(t, l);
}