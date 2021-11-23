public boolean isOfferAccepted(org.apache.mesos.Protos.Offer offer) {
    if ((_constraints.size()) > 0) {
        return _constraints.meetsAllConstraints(offer);
    }else {
        return isHostAccepted(offer.getHostname());
    }
}