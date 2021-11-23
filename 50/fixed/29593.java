public us.freeandfair.corla.model.AuditBoard currentAuditBoard() {
    if ((my_current_audit_board) == null) {
        return null;
    }else {
        return my_audit_boards.get(my_current_audit_board);
    }
}