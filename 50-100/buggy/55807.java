@java.lang.Override
public void onProvidersRequest(lk.ac.mrt.distributed.ProvidersRequest providersRequest) {
    java.lang.String word = providersRequest.getWord();
    lk.ac.mrt.distributed.api.Node requestingNode = providersRequest.getNode();
    java.util.List<lk.ac.mrt.distributed.api.Node> providers = this.resourceProviders.get(word);
    try {
        if (providers != null) {
            lk.ac.mrt.distributed.SearchNode.logger.warn("Null provider request. Possible error in protocol");
            providers = new java.util.ArrayList<>();
        }
        this.nodeOps.sendProviders(requestingNode, word, providers);
    } catch (lk.ac.mrt.distributed.api.exceptions.CommunicationException e) {
        e.printStackTrace();
    }
}