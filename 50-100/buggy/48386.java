private static void printInterfaces(org.eclipse.birt.report.engine.api.IParameterDefnBase definition) {
    de.interseroh.report.services.BirtReportUtil.logger.debug(("Class:" + (definition.getClass().getCanonicalName())));
    for (java.lang.Class<?> anInterface : definition.getClass().getInterfaces()) {
        de.interseroh.report.services.BirtReportUtil.logger.debug(("\t" + anInterface));
    }
    de.interseroh.report.services.BirtReportUtil.logger.debug("");
}