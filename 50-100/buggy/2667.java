@java.lang.Override
public void dispatchThrottle(jmri.DccThrottle t, jmri.ThrottleListener l) {
    jmri.jmrix.loconet.LnThrottleManager.log.debug("dispatchThrottle - throttle {}", t.getLocoAddress());
    jmri.jmrix.loconet.LocoNetThrottle lnt = ((jmri.jmrix.loconet.LocoNetThrottle) (t));
    jmri.jmrix.loconet.LocoNetSlot tSlot = lnt.getLocoNetSlot();
    tc.sendLocoNetMessage(tSlot.writeStatus(LnConstants.LOCO_COMMON));
    tc.sendLocoNetMessage(tSlot.dispatchSlot());
    super.releaseThrottle(t, l);
}