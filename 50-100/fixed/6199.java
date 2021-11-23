protected void executeProgram() throws java.lang.Exception {
    int numTries = 0;
    int maxRetries = 5;
    while (true) {
        try {
            org.broadinstitute.gatk.engine.CommandLineGATK.start(new org.broadinstitute.gatk.engine.CommandLineGATK(), this.programArgs.toArray(new java.lang.String[0]));
            return ;
        } catch (com.github.sparkcaller.utils.org.broadinstitute e) {
            if ((++numTries) == maxRetries) {
                java.lang.System.err.println((("Failed to run GATK program " + maxRetries) + " times!"));
                return ;
            }
        }
    } 
}