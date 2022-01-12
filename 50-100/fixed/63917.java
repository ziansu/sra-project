public static double heuristicCost(int start, int goal) {
    int h = (com.company.Main.delinearize(start)[0]) - (com.company.Main.delinearize(goal)[0]);
    int w = (com.company.Main.delinearize(start)[1]) - (com.company.Main.delinearize(goal)[1]);
    return java.lang.Math.sqrt(((h * h) + (w * w)));
}