private void verifyParameters() throws ca.on.oicr.pde.utilities.SgePollException {
    java.lang.System.out.println("Verify params!");
    for (java.lang.String option : new java.lang.String[]{ "unique-job-string" , "output-file" }) {
        if (!(options.has(option))) {
            stderr.append(get_syntax());
            stderr.append("Must include parameter: --").append(option).append("\n");
            throw new ca.on.oicr.pde.utilities.SgePollException(("Must include parameter: --" + option));
        }
    }
}