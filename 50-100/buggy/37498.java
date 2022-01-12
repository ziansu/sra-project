public void changeMasterPassword(java.lang.String oldPassword, java.lang.String newPassword, boolean inFirstTimeWizard) throws freenet.node.MasterKeysFileSizeException, freenet.node.MasterKeysWrongPasswordException, freenet.node.Node.AlreadySetPasswordException, java.io.IOException {
    if ((securityLevels.getPhysicalThreatLevel()) == (freenet.node.SecurityLevels.PHYSICAL_THREAT_LEVEL.MAXIMUM))
        freenet.support.Logger.error(this, "Changing password while physical threat level is at MAXIMUM???");
    
    if (masterKeysFile.exists()) {
        keys.changePassword(masterKeysFile, newPassword, secureRandom);
        setPasswordInner(keys, inFirstTimeWizard);
        keys.clearAll();
    }else {
        setMasterPassword(newPassword, inFirstTimeWizard);
    }
}