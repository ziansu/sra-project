public static void main(java.lang.String[] args) throws de.scrum_master.dancing_links.ColumnAlreadyExistsException {
    de.scrum_master.dancing_links.Matrix matrix = new de.scrum_master.dancing_links.Matrix("Test matrix");
    matrix.addColumns(false, "A", "B", "C", "D", "E").addRowOfNodes("A", "D").addRowOfNodes("B", "C", "D").addRowOfNodes("D", "E").addRowOfNodes("A", "E").addRowOfNodes("B", "C").addRowOfNodes("E");
    java.lang.System.out.println(matrix.columnsToText());
}