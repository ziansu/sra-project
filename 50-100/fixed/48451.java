public static boolean allFrontLinesAreNegative(java.util.List<il.ac.tau.cs.RRoDC.revenues.Rmarginal> marginalRevenues) {
    boolean allFrontLinesAreNegative = true;
    for (il.ac.tau.cs.RRoDC.revenues.Rmarginal marginalRevenue : marginalRevenues) {
        if ((!(marginalRevenue.isExhausted())) && ((marginalRevenue.getFrontlineValue()) >= 0)) {
            allFrontLinesAreNegative = false;
            break;
        }
    }
    return allFrontLinesAreNegative;
}