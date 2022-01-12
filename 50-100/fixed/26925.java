@java.lang.Override
public de.lmu.ifi.dbs.elki.database.ids.KNNList getKNNForObject(O obj, int k) {
    final de.lmu.ifi.dbs.elki.database.ids.KNNHeap knns = de.lmu.ifi.dbs.elki.database.ids.DBIDUtil.newHeap(k);
    for (double[] v : tree.nearestNeighbour(k, oToDouble(obj, new double[dims]))) {
        de.lmu.ifi.dbs.elki.database.ids.DBID id = tree.get(v);
        O o2 = relation.get(id);
        double distance = norm.distance(obj, o2);
        knns.insert(distance, id);
    }
    return knns.toKNNList();
}