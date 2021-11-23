private void updateCVRUnderAudit(final int the_index) {
    int index = the_index;
    do {
        if ((my_submitted_audit_cvrs.get(index)) == (java.lang.Long.MIN_VALUE)) {
            my_cvr_under_audit = index;
            break;
        }
        index = index + 1;
    } while (index < (my_submitted_audit_cvrs.size()) );
}