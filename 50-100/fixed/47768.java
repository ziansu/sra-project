private static void runTestFile(java.lang.String path) throws java.lang.Exception {
    librec.data.DataDAO testDao = new librec.data.DataDAO(path, librec.main.LibRec.rateDao.getUserIds(), librec.main.LibRec.rateDao.getItemIds());
    librec.data.SparseMatrix testMatrix = testDao.readData();
    librec.intf.Recommender algo = librec.main.LibRec.getRecommender(new librec.data.SparseMatrix[]{ librec.main.LibRec.rateMatrix , testMatrix }, (-1));
    algo.execute();
    librec.main.LibRec.printEvalInfo(algo, algo.measures);
}