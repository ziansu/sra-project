private void appendBreakStmt(de.fhg.iais.roberta.syntax.stmt.RepeatStmt<java.lang.Void> repeatStmt) {
    if ((repeatStmt.getMode()) == (de.fhg.iais.roberta.syntax.stmt.RepeatStmt.Mode.WAIT)) {
        nlIndent();
        this.sb.append("break;");
    }
}