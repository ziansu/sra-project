public org.objectteams.Team getInstance() throws java.lang.IllegalAccessException, java.lang.InstantiationException {
    org.objectteams.Team inst = this.instance;
    if (inst != null)
        return inst;
    
    java.lang.Class<? extends org.objectteams.Team> cl = this.teamClass;
    assert cl != null : "Precondition";
    @java.lang.SuppressWarnings(value = "null")
    @org.eclipse.jdt.annotation.NonNull
    org.objectteams.Team nnInst = cl.newInstance();
    org.eclipse.objectteams.otequinox.TransformerPlugin.registerTeamInstance(nnInst);
    org.eclipse.objectteams.otequinox.TransformerPlugin.log(IStatus.INFO, ("Instantiated team " + (teamName)));
    return this.instance = nnInst;
}