public static int findSecond(int money, int cost, int indexOfFirst) {
    int costOfSecond = money - cost;
    return com.epam.Solution.pull(indexOfFirst, costOfSecond);
}