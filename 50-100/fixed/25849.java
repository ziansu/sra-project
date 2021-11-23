public static int daysLeft(int population) {
    int days = 1;
    int healthy = population - 1;
    int infected = 1;
    int newInfected = infected;
    while (healthy > 0) {
        newInfected *= 2;
        infected += newInfected;
        healthy -= newInfected;
        days++;
    } 
    return days;
}