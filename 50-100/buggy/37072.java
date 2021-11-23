private java.lang.String runACommand(java.lang.String st) throws ca.on.oicr.pde.utilities.SgePollException {
    org.apache.commons.exec.CommandLine command = org.apache.commons.exec.CommandLine.parse(st);
    org.apache.oozie.action.sge.Invoker.Result result = org.apache.oozie.action.sge.Invoker.invoke(command);
    if ((result.exit) != 0) {
        stderr.append("Exit value from ").append(st).append(":").append(result.exit);
        java.lang.System.out.println(("Failed command: " + st));
        throw new ca.on.oicr.pde.utilities.SgePollException(("Command failed: " + st));
    }
    return result.output;
}