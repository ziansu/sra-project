private void validateModuleIDs(java.util.List<org.eclipse.smarthome.automation.Module> modules) {
    for (org.eclipse.smarthome.automation.Module m : modules) {
        java.lang.String mId = m.getId();
        if ((mId == null) || (!(mId.matches("[A-Za-z0-9_-]*")))) {
            throw new java.lang.IllegalArgumentException((("Invalid module uid: " + (mId != null ? mId : "null")) + ". It must not be null or not fit to the pattern: [A-Za-z0-9_-]*"));
        }
    }
}