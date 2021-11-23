private org.eclipse.viatra.query.runtime.rete.network.CommunicationTracker.CommunicationGroup getGroup(final org.eclipse.viatra.query.runtime.rete.network.Node node) {
    final org.eclipse.viatra.query.runtime.rete.network.Node representative = sccInformationProvider.getRepresentative(node);
    final org.eclipse.viatra.query.runtime.rete.network.CommunicationTracker.CommunicationGroup group = groupMap.get(representative);
    return group;
}