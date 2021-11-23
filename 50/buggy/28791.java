public waazdoh.cp2p.common.MNodeID getTo(final java.lang.String string) {
    java.lang.String to = getAttribute("to");
    if (to != null) {
        return new waazdoh.cp2p.common.MNodeID(to);
    }else {
        return null;
    }
}