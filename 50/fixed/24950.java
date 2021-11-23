public void removeEndPoint(org.wilson.world.endpoint.EndPoint ep) {
    if ((ep != null) && ((ep.getName()) != null)) {
        this.eps.remove(ep.getName());
    }
}