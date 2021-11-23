public double stepAvgWeek(double[] weekAvg) {
    int count = 0;
    double total = 0;
    while (count != 6) {
        total = total + (weekAvg[count]);
        count++;
    } 
    total = total / 7;
    total = (java.lang.Math.floor((total * 100))) / 100;
    return total;
}