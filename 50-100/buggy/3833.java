public void run() {
    jmri.jmrix.lenz.liusbethernet.jmri.jmrix.lenz.XNetSystemConnectionMemo m = this.getSystemConnectionMemo();
    jmri.jmrix.lenz.XNetTrafficController t = m.getXNetTrafficController();
    jmri.jmrix.lenz.liusbethernet.jmri.jmrix.lenz.XNetProgrammer p = ((jmri.jmrix.lenz.liusbethernet.jmri.jmrix.lenz.XNetProgrammer) (m.getProgrammerManager().getGlobalProgrammer()));
    if (!(p.programmerBusy())) {
        t.sendXNetMessage(jmri.jmrix.lenz.liusbethernet.jmri.jmrix.lenz.XNetMessage.getCSStatusRequestMessage(), null);
    }
}