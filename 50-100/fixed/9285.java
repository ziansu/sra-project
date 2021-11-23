public void addProver(java.lang.String proverName, java.lang.String command, boolean override) throws exceptions.NameAlreadyInUseException {
    if ((!override) && (prover.local.LocalProver.availableProvers.contains(proverName)))
        throw new exceptions.NameAlreadyInUseException(((("Name " + proverName) + " is already in use with command ") + (gui.Config.getLocalProverCommand(proverName))));
    
    gui.Config.setLocalProverCommand(proverName, command);
    if (!(prover.local.LocalProver.availableProvers.contains(proverName)))
        prover.local.LocalProver.availableProvers.add(proverName);
    
    gui.Config.setLocalProvers(prover.local.LocalProver.availableProvers);
}