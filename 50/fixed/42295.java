static double getADL() {
    double total = 0;
    for (double d : rallocloud.main.Statistician.delays) {
        total += d;
    }
    return rallocloud.main.Statistician.delays.isEmpty() ? 0 : total / (rallocloud.main.Statistician.delays.size());
}