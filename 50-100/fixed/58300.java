public void removeAssignment(int cell, int val) {
    for (int j = (satisfyingAssignments.size()) - 1; j >= 0; j--) {
        if (satisfyingAssignments.get(j).get(cell).equals(new java.lang.Integer(val))) {
            satisfyingAssignments.remove(j);
        }
    }
}