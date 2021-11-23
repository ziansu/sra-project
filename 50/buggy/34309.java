public void updateLinkCost(int dest, int newcost) {
    java.lang.System.out.println(((((("updateLinkCost for router " + (myID)) + " to router ") + dest) + " with cost ") + newcost));
    costs[dest] = newcost;
    printDistanceTable();
}