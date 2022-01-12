@java.lang.Override
protected void cancelPressed() {
    if ((this.profile) != null) {
        this.profile.setName(profileNameOld);
        this.profile.getAction().clear();
        for (sernet.verinice.model.auth.Action action : selectedActionsOld) {
            this.profile.getAction().add(action);
        }
    }
    super.okPressed();
}