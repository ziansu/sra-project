public static void printParameterDefinitions(java.util.Collection<org.eclipse.birt.report.engine.api.IParameterDefnBase> parameterDefinitions, org.eclipse.birt.report.engine.api.IGetParameterDefinitionTask task) {
    for (org.eclipse.birt.report.engine.api.IParameterDefnBase definition : parameterDefinitions) {
        de.interseroh.report.services.BirtReportUtil.logger.debug("-------------------------------------------------");
        de.interseroh.report.services.BirtReportUtil.printInterfaces(definition);
        de.interseroh.report.services.BirtReportUtil.logger.debug("");
        de.interseroh.report.services.BirtReportUtil.printParameter(definition);
        de.interseroh.report.services.BirtReportUtil.printScalarParameter(definition);
        de.interseroh.report.services.BirtReportUtil.printParameterGroup(task, definition);
        de.interseroh.report.services.BirtReportUtil.printSelectionList(definition, task);
    }
}