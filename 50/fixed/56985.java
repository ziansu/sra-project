public static java.util.List<org.zkoss.bind.PhaseListener> getSystemPhaseListeners() {
    java.util.Collection<org.zkoss.bind.PhaseListener> values;
    synchronized(org.zkoss.bind.init.ZKBinderPhaseListeners._listeners) {
        values = org.zkoss.bind.init.ZKBinderPhaseListeners._listeners.values();
    }
    return new java.util.LinkedList<org.zkoss.bind.PhaseListener>(values);
}