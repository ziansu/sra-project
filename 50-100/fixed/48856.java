public double getLength() {
    double sum = 0;
    int cur = list1.get(0);
    for (int i = 1; i < (list1.size()); i++) {
        sum += com.company.AStar.heuristicCost(cur, list1.get(i));
        cur = list1.get(i);
    }
    return sum;
}