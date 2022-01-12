public boolean containsAddress(java.lang.String address) {
    if ((this.address.size()) != 0) {
        for (int i = 0; i < (this.address.size()); i++) {
            if (this.address.get(i).equals(address)) {
                return true;
            }else {
                return false;
            }
        }
    }
    return false;
}