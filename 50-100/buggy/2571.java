protected java.util.List<java.lang.Class<?>> appendAddonModules(java.util.List<java.lang.Class<?>> modules) {
    modules.addAll(java.util.Arrays.asList(org.isisaddons.module.audit.AuditModule.class, org.isisaddons.module.command.CommandModule.class, org.isisaddons.module.excel.ExcelModule.class, org.isisaddons.module.devutils.DevUtilsModule.class, org.isisaddons.module.poly.PolyModule.class, org.isisaddons.module.sessionlogger.SessionLoggerModule.class, org.isisaddons.module.stringinterpolator.StringInterpolatorModule.class));
    return modules;
}