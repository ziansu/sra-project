private void informListeningComponentsAboutUpdates(se.sics.ms.search.ApplicationSelf self) {
    se.sics.ms.search.PeerDescriptor updatedDesc = self.getSelfDescriptor();
    selfDescriptor = updatedDesc;
    trigger(new se.sics.ms.ports.SelfChangedPort.SelfChangedEvent(self), selfChangedPort);
    trigger(new se.sics.p2ptoolbox.gradient.msg.GradientUpdate<se.sics.ms.search.PeerDescriptor>(updatedDesc), gradientPort);
    trigger(new se.sics.ms.search.ViewUpdate(electionRound, updatedDesc), electionPort);
    trigger(selfDescriptor, selfViewUpdatePort);
    se.sics.ms.aggregator.SearchComponentInfo componentInfo = new se.sics.ms.aggregator.SearchComponentInfo(updatedDesc, 0, leaderAddress);
    se.sics.ktoolbox.aggregator.client.events.ComponentInfoEvent event = new se.sics.ktoolbox.aggregator.client.events.ComponentInfoEvent(defaultComponentOverlayId, componentInfo);
    trigger(event, localAggregatorPort);
}