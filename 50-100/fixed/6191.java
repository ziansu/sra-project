public void validate() {
    if ((dtinseconds) <= 0)
        edu.berkeley.path.beats.simulator.utils.BeatsErrorLog.addError("dt<=0 in a time profile");
    
    if ((!(java.lang.Double.isInfinite(dtinseconds))) && ((samplesteps) <= 0))
        edu.berkeley.path.beats.simulator.utils.BeatsErrorLog.addError("samplesteps<=0 in a time profile");
    
}