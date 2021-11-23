public boolean isOfferAccepted(org.apache.mesos.Protos.Offer offer) {
    if (!(mesosStormConf.containsKey(storm.mesos.MesosNimbus.CONF_MESOS_CONSTRAINTS))) {
        return isHostAccepted(offer.getHostname());
    }else {
        return _constraints.meetsAllConstraints(offer);
    }
}