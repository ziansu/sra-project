private void filterFilesByName(java.util.List<java.lang.String> filters, java.util.List<io.linuxserver.davos.transfer.ftp.FTPFile> filteredFiles, io.linuxserver.davos.transfer.ftp.FTPFile file) {
    for (java.lang.String filter : filters) {
        java.lang.String expression = io.linuxserver.davos.util.PatternBuilder.buildFromFilterString(filter);
        if (file.getName().toLowerCase().matches(expression.toLowerCase())) {
            io.linuxserver.davos.schedule.workflow.FilterFilesWorkflowStep.LOGGER.debug("Matched {} to {}. Adding to final filter list.", file.getName().toLowerCase(), expression.toLowerCase());
            filteredFiles.add(file);
            return ;
        }
    }
}