private boolean tryRegister(java.lang.String user, java.lang.String password) {
    try {
        PwdManager.Registration.registerUser(user, password);
        return true;
    } catch (java.nio.file.FileAlreadyExistsException e) {
        PwdManager.UI.UIUtility.errorMessage("Registration.", (("User " + user) + " already exists."));
        return false;
    } catch (java.lang.Exception e) {
        PwdManager.UI.UIUtility.errorMessage("Registration", e.getMessage());
        return false;
    }
}