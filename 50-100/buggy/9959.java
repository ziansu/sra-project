private metaopt.Operation chooseOpToSchedule(java.util.ArrayList<metaopt.Operation> conflicts) {
    int index = (randomNumber) % (conflicts.size());
    for (metaopt.Operation op : schedulable) {
        if (conflicts.get(index).equals(op)) {
            schedulable.remove(op);
            return op;
        }
    }
    return null;
}