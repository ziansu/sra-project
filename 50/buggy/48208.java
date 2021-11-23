protected java.util.List<org.obiba.onyx.jade.core.domain.run.Measure> resolveMeasure(org.obiba.magma.ValueSet valueSet, org.obiba.magma.Variable variable) {
    org.obiba.onyx.jade.core.domain.run.InstrumentRun instrumentRun = ((org.obiba.onyx.jade.core.domain.run.InstrumentRun) (resolveInstrumentRun(valueSet, variable)));
    if (instrumentRun != null) {
        return instrumentRun.getMeasures();
    }
    return null;
}