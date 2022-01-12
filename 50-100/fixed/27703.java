private void addTalker(world.soapboxrace.srv.protocol.FreeroamTalker newFreeroamTalker, world.soapboxrace.srv.protocol.FreeroamTalker freeroamTalker) {
    for (int i = 0; i < (limit); i++) {
        if ((visibleTalkers.get(i)) == null) {
            visibleTalkers.set(i, newFreeroamTalker);
            return ;
        }
    }
}