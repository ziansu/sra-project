public void setInvitedDivision(java.util.List<de.steilerdev.myVerein.server.model.Division> invitedDivision) {
    if (invitedDivision != null) {
        this.invitedDivision = de.steilerdev.myVerein.server.controller.DivisionManagementController.getOptimizedSetOfDivisions(invitedDivision);
    }else {
        this.invitedDivision = invitedDivision;
    }
}