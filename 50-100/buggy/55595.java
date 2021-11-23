private com.excilys.burleon.computerdatabase.webapp.controller.util.ProcessResult removeComputersProcess(final com.excilys.burleon.computerdatabase.webapp.controller.ComputerManageController.ProcessVariables processVariables) {
    try {
        com.excilys.burleon.computerdatabase.webapp.controller.ComputerManageController.LOGGER.info(("Remove OK for " + (processVariables.computerReceived)));
        return new com.excilys.burleon.computerdatabase.webapp.controller.util.ProcessResult(this.computerService.remove(com.excilys.burleon.computerdatabase.webapp.dtomodel.mapper.ComputerMapper.toComputer(processVariables.computer)), messageSource.getMessage("message_remove_ok", null, org.springframework.context.i18n.LocaleContextHolder.getLocale()));
    } catch (org.springframework.context.NoSuchMessageException e) {
        return new com.excilys.burleon.computerdatabase.webapp.controller.util.ProcessResult(true, messageSource.getMessage("message_save_no_such_message", null, org.springframework.context.i18n.LocaleContextHolder.getLocale()));
    }
}