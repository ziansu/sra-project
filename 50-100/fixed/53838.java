private java.util.Map<java.lang.Integer, jp.co.tabocom.teratermstation.model.Login> getLoginMap() {
    if (((this.loginMap) != null) && (!(this.loginMap.isEmpty()))) {
        return this.loginMap;
    }
    if ((this.category) != null) {
        return this.category.getLoginMap();
    }
    return getParent().getLoginMap();
}