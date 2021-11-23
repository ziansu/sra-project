@java.lang.Override
public boolean disposeThrottle(jmri.DccThrottle t, jmri.ThrottleListener l) {
    jmri.jmrix.loconet.LnThrottleManager.log.debug("disposeThrottle - throttle {}", t.getLocoAddress());
    if (t instanceof jmri.jmrix.loconet.LocoNetThrottle) {
        if (super.disposeThrottle(t, l)) {
            jmri.jmrix.loconet.LocoNetThrottle lnt = ((jmri.jmrix.loconet.LocoNetThrottle) (t));
            lnt.throttleDispose();
            return true;
        }
    }
    return false;
}