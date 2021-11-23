public static java.util.List<org.zkoss.bind.PhaseListener> getSystemPhaseListeners() {
    return new java.util.LinkedList<org.zkoss.bind.PhaseListener>(org.zkoss.bind.init.ZKBinderPhaseListeners._listeners.values());
}