@java.lang.Override
public java.util.List<com.wipro.ats.bdre.md.dao.jpa.LineageQuery> execute(java.lang.String[] params) {
    try {
        org.apache.commons.cli.CommandLine commandLine = getCommandLine(params, com.wipro.ats.bdre.GetLineageQueryByProcessId.PARAMS_STRUCTURE);
        java.lang.String pid = commandLine.getOptionValue("sub-process-id");
        com.wipro.ats.bdre.GetLineageQueryByProcessId.LOGGER.debug(("Sub-Process id  is " + pid));
        if (pid.equals("EMPTY")) {
            return lineageQueryDAO.listAll();
        }
        return lineageQueryDAO.getLastInstanceExecLists(java.lang.Integer.parseInt(pid));
    } catch (java.lang.Exception e) {
        com.wipro.ats.bdre.GetLineageQueryByProcessId.LOGGER.error("Error occurred", e);
        throw new com.wipro.ats.bdre.exception.MetadataException(e);
    }
}