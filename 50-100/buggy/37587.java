private void addInternal(T node, int replica) {
    if (replica == 0) {
        items.remove(node);
    }else {
        hudson.util.ConsistentHash.Point[] points = new hudson.util.ConsistentHash.Point[replica];
        java.lang.String seed = hash.hash(node);
        for (int i = 0; i < replica; i++)
            points[i] = new hudson.util.ConsistentHash.Point(md5(((seed + ':') + i)), node);
        
        items.put(node, points);
    }
}