public void removeAssignment(int cell, int val) {
    for (int j = (satisfyingAssignments.size()) - 1; j >= 0; j--) {
        if (satisfyingAssignments.get(j).get(cell).equals(new java.lang.Integer(val))) {
            java.lang.System.out.println((("cell j " + cell) + j));
            java.lang.System.out.println(((("satisfyingAssignment.get(i " + (satisfyingAssignments.get(j))) + " val ") + val));
        }
    }
}