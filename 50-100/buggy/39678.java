protected org.obiba.onyx.jade.core.domain.run.InstrumentRunValue resolveInstrumentRunValue(org.obiba.magma.ValueSet valueSet, org.obiba.magma.Variable variable) {
    org.obiba.onyx.jade.core.domain.run.InstrumentRun instrumentRun = resolveInstrumentRun(valueSet, variable);
    if (instrumentRun != null) {
        java.lang.String parameterCode = org.obiba.onyx.util.StringUtil.splitAndReturnTokenAt(variable.getName(), "\\.", 0);
        if (parameterCode != null) {
            for (org.obiba.onyx.jade.core.domain.run.InstrumentRunValue runValue : instrumentRun.getInstrumentRunValues()) {
                if (runValue.getInstrumentParameter().equals(parameterCode)) {
                    return runValue;
                }
            }
        }
    }
    return null;
}