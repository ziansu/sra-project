public static void launch(int port, java.lang.String server, java.lang.instrument.Instrumentation inst) {
    de.schenk.jrtrace.helperlib.JRLog.debug(java.lang.String.format("JRTrace Agent launched port:%d on network interface: %s", port, (server == null ? "<auto>" : server)));
    de.schenk.jrtrace.helper.InstrumentationUtil.setInstrumentation(inst);
    de.schenk.jrtrace.helperagent.AgentMain.instrumentation = inst;
    if ((de.schenk.jrtrace.helperagent.AgentMain.theAgent) != null) {
        de.schenk.jrtrace.helperagent.AgentMain.theAgent.stop(false);
        de.schenk.jrtrace.helperagent.AgentMain.theAgent = null;
    }
    if ((de.schenk.jrtrace.helperagent.AgentMain.theAgent) == null) {
        de.schenk.jrtrace.helperagent.AgentMain.theAgent = new de.schenk.jrtrace.helperagent.AgentMain();
        de.schenk.jrtrace.helperagent.AgentMain.theAgent.start(port, server);
    }
}