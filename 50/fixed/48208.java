protected java.util.List<org.obiba.onyx.jade.core.domain.run.Measure> resolveMeasure(org.obiba.magma.ValueSet valueSet, org.obiba.magma.Variable variable) {
    org.obiba.onyx.jade.core.domain.run.InstrumentRun instrumentRun = resolveInstrumentRun(valueSet, variable);
    return instrumentRun == null ? null : instrumentRun.getMeasures();
}