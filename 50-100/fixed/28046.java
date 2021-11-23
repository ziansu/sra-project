private static boolean closeEnough(java.lang.Double value, java.lang.String rel, java.lang.String entity) {
    rel = rel.split("&")[0];
    java.util.ArrayList<java.lang.Double> goldValues = main.java.iitb.neo.goldDB.GoldDB.getGoldDBValue(entity, rel, main.java.iitb.neo.training.algorithm.lpercp.GoldDbInference.K);
    for (java.lang.Double val : goldValues) {
        java.lang.Double valueSlack = 0.9 * val;
        if ((value > (val - valueSlack)) && (value < (val + valueSlack))) {
            return true;
        }
    }
    return false;
}