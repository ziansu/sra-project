protected java.math.BigInteger closestPrecedingNode(decc.dht.Key id) {
    for (int k = m; k >= 1; k--) {
        java.math.BigInteger finger = finger(k);
        if (((finger.compareTo(key.getKey())) > 0) && ((finger.compareTo(key.getKey())) < 0))
            return finger;
        
    }
    return key.getKey();
}