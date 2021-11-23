protected void sendTestMessage(jmri.jmrix.nce.NceMessage m) {
    if (jmri.jmrix.nce.NceInterfaceScaffold.log.isDebugEnabled()) {
        jmri.jmrix.nce.NceInterfaceScaffold.log.debug((("sendTestMessage    [" + m) + "]"));
    }
    notifyMessage(m, null);
    return ;
}