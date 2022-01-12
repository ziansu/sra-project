public static int addMonthsExtend(int dint, int add) {
    int months = ((((dint.Dint.year(dint)) * 12) + (dint.Dint.month(dint))) - 1) + add;
    return dint.Dint.composeExtend(dint, (months / 12), ((months % 12) + 1));
}