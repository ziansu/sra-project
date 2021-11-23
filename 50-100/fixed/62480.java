private dgh.database.DGHDatabase selectHighestPrecision(java.util.List<dgh.database.DGHDatabase> list) {
    java.util.Collections.shuffle(list);
    double prec = -1.0;
    dgh.database.DGHDatabase res = null;
    for (dgh.database.DGHDatabase db : list) {
        if ((db.calculatePrecisionOfData()) > prec) {
            prec = db.calculatePrecisionOfData();
            res = db;
        }
    }
    return res;
}