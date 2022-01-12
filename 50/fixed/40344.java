protected org.cometd.oort.OortComet findComet(java.lang.String cometURL) {
    org.cometd.oort.OortComet result = _pendingComets.get(cometURL);
    if (result == null)
        result = getComet(cometURL);
    
    return result;
}