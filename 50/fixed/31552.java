public static synchronized int deleteExperiment(int eid) {
    serverplus.DBManager db = new serverplus.DBManager();
    int res = db.deleteExperiment(eid);
    return res;
}