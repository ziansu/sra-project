public void networkUpdate(remarema.services.network.UpdateNetwork command) {
    remarema.domain.Network nw = em.find(remarema.domain.Network.class, command.getNetworkID());
    nw.setNetworkName(command.getNetworkName());
    remarema.domain.Network parentNetwork = findParentNetwork(command.getNetworkParentName());
    parentNetwork.setNetworkName(command.getNetworkParentName());
    nw.setParent(parentNetwork);
    em.flush();
}