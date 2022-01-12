public static int findSecond(int money, int cost, int indexOfFirst) {
    if (cost >= money)
        return -1;
    
    int costOfSecond = money - cost;
    return com.epam.Solution.pull(indexOfFirst, costOfSecond);
}