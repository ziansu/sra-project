public double calculateCost() {
    double cost = 0;
    for (int i = 0; i < (inspectionListToDo.size()); i++) {
        cost = +(inspectionListToDo.get(i).getPrice());
    }
    return cost;
}