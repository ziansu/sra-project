private org.dnal.core.DValue maybeGenProxy(org.dnal.core.DValue dval) {
    if ((dval != null) && (this.useProxyDVals)) {
        return new org.dnal.core.DValueProxy(dval);
    }else {
        return dval;
    }
}