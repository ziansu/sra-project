protected void notifyProgListenerEnd(int value, int status) {
    jmri.jmrix.sprog.SprogProgrammer.log.debug(((("notifyProgListenerEnd value " + value) + " status ") + status));
    if ((_usingProgrammer) == null) {
        jmri.jmrix.sprog.SprogProgrammer.log.error("No listener to notify");
    }else {
        jmri.jmrix.sprog.jmri.ProgListener temp = _usingProgrammer;
        _usingProgrammer = null;
        temp.programmingOpReply(value, status);
    }
}