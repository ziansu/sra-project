private static java.util.ArrayList<java.lang.String> execCmd(java.lang.String mainCmd) {
    java.lang.String[] cmd = new java.lang.String[]{ "/bin/sh" , "-c" , mainCmd };
    try {
        eu.tango.self.adaptation.manager.actuators.SlurmActuator.execCmd(cmd);
    } catch (java.io.IOException ex) {
        java.util.logging.Logger.getLogger(eu.tango.self.adaptation.manager.actuators.SlurmActuator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    return new java.util.ArrayList<>();
}