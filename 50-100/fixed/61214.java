private void informSuperiorInit() {
    if (!(freedays.domain.Request.DEBUG)) {
        if (this.hasApprover()) {
            freedays.domain.RegularUser superapprover = getSuperiorRegularUser();
            if ((superapprover != null) && (!(this.getApprover().getRegularUser().equals(superapprover)))) {
                freedays.util.MailUtils.sendUpperRequestNotification(superapprover.getEmail(), superapprover.getFullName(), this.getApprover().getRegularUser().getFullName(), this.toString());
            }
        }
    }
}