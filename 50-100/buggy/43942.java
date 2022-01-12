private void addLastApprenticeToFrontOfQueue(java.util.List<LunchManCore.Apprentice> unassignedApprentices, LunchManCore.Apprentice nextApprentice) {
    int existingNextApprenticePosition = -1;
    for (int i = 0; i < (unassignedApprentices.size()); i++) {
        if (nextApprentice.getName().equals(unassignedApprentices.get(i).getName())) {
            existingNextApprenticePosition = i;
        }
    }
    if (existingNextApprenticePosition != (-1)) {
        unassignedApprentices.remove(existingNextApprenticePosition);
    }
    insertNewApprentice(0, unassignedApprentices, nextApprentice);
}