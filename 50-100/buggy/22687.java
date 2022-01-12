@java.lang.Override
public java.util.Collection<S> getIds() {
    java.util.ArrayList<S> ids = new java.util.ArrayList<S>();
    for (org.springframework.statemachine.region.Region<S, E> r : org.springframework.statemachine.state.RegionState.getRegions()) {
        org.springframework.statemachine.state.State<S, E> s = r.getState();
        if (s != null) {
            ids.addAll(s.getIds());
        }
    }
    return ids;
}