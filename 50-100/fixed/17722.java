java.lang.String getLastAppliedId() throws org.jboss.provision.ProvisionException {
    final java.io.File lastTxt = new java.io.File(recordsDir, org.jboss.provision.InstructionHistory.LAST_INSTR_TXT);
    if (!(lastTxt.exists())) {
        return null;
    }
    try {
        return org.jboss.provision.io.FileUtils.readFile(lastTxt);
    } catch (java.io.IOException e) {
        throw org.jboss.provision.ProvisionErrors.readError(org.jboss.provision.io.IoUtils.newFile(recordsDir, org.jboss.provision.InstructionHistory.LAST_INSTR_TXT), e);
    }
}