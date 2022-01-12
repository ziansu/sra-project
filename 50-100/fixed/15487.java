private boolean doesParentLoopMatch(org.pb.x12.Cf child, java.lang.String[] tokens, org.pb.x12.Loop loop) {
    org.pb.x12.Cf parent = child.getParent();
    if (parent == null)
        return false;
    
    loopMarker = loop.getParent();
    for (org.pb.x12.Cf cf : parent.childList()) {
        if (doesLoopMatch(cf, tokens)) {
            cfMarker = cf;
            return true;
        }
    }
    return doesParentLoopMatch(parent, tokens, loopMarker);
}