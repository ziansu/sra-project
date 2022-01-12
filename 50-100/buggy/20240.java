protected int calculateTcrForMachine(Machine m) {
    int total = 0;
    for (PositionlessPair<Machine, Machine> machines : closenesses.keySet()) {
        if (machines.contains(m)) {
            total = closenesses.get(machines).getValue();
        }
    }
    return total;
}