public int decr(java.lang.String address, int port) {
    for (org.openstack4j.model.compute.Image image : this.getImages()) {
        if (address.equals(image.getAddress())) {
            image.setNbRequest(((image.getNbRequest()) - 1));
            break;
        }
    }
    return 1;
}