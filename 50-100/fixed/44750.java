public static int addMonths(int dint, int add) {
    int months = ((((dint.Dint.year(dint)) * 12) + (dint.Dint.month(dint))) - 1) + add;
    return dint.Dint.composeLimit(dint, (months / 12), ((months % 12) + 1));
}