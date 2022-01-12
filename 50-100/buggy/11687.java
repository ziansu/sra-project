public boolean isOppositeOf(org.eclipse.emf.diffmerge.api.diff.IReferenceValuePresence peer_p) {
    return ((((getPresenceRole()) == (peer_p.getPresenceRole())) && ((getFeature().getEOpposite()) == (peer_p.getFeature()))) && ((getElementMatch()) == (peer_p.getValueMatch()))) && ((getValue()) == (peer_p.getElementMatch()));
}