public static int addMonths(int dint, int add) {
    int months = (((dint.Dint.year(dint)) * 12) + (dint.Dint.month(dint))) + add;
    return dint.Dint.composeLimit(dint.Dint.day(dint), (months / 12), (months % 12));
}