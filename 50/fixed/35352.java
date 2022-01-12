public boolean isSame(com.geolocation.search.model.Place toCompare) {
    if ((isSameName(toCompare)) && (this.address.isSameAddress(toCompare.getAddress()))) {
        return true;
    }
    return false;
}