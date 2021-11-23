@java.lang.Override
protected void result(java.lang.Object object) {
    if (((java.lang.Boolean) (object)) && ((profileController.getAllProfiles().length) > 1)) {
        profileController.deleteProfile(profileList.getSelected());
    }else {
        deletionError = new com.retroMachines.ui.RetroDialog("", "Zum Spielen brauchst du ein Profil!");
        deletionError.show(stage);
        this.remove();
    }
}