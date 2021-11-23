public decc.Peer roadFrom(decc.Peer p) {
    if (p == (peerA))
        return peerB;
    
    if (p == (peerB))
        return peerA;
    
    return null;
}