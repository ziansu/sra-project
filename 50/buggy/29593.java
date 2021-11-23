public us.freeandfair.corla.model.AuditBoard currentAuditBoard() {
    if (my_audit_boards.isEmpty()) {
        return null;
    }else {
        return my_audit_boards.get(my_current_audit_board);
    }
}