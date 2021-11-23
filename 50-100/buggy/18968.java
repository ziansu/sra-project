public void init(fr.jgetmove.jgetmove.database.Database database) {
    fr.jgetmove.jgetmove.debug.Debug.println(("totalItem : " + (database.getClusterIds())));
    java.util.ArrayList<java.lang.Integer> itemsets = new java.util.ArrayList<>();
    java.util.ArrayList<java.lang.Integer> freqItemset = new java.util.ArrayList<>();
    run(database, itemsets, database.getTransactionIds(), freqItemset);
}