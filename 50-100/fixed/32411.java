public static double averageConsumption(java.util.ArrayList<com.example.smano.app.Metrhsh> metrhshes) {
    double sumMetrhseis = 0;
    double averageMerthsh = 0;
    if ((metrhshes.size()) == 0) {
        return -1;
    }
    for (int i = 0; i < (metrhshes.size()); i++) {
        sumMetrhseis += metrhshes.get(i).getSumKilovatora();
    }
    averageMerthsh = sumMetrhseis / (metrhshes.size());
    return averageMerthsh;
}