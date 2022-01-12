public void prettyPrint(com.coducation.smallbasic.Assign assignStmt) {
    prettyPrint(assignStmt.getLSide());
    java.lang.System.out.print(" = ");
    prettyPrint(assignStmt.getRSide());
    java.lang.System.out.println();
}