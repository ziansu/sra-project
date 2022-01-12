protected java.lang.Object resolveContraindication(org.obiba.magma.ValueSet valueSet, org.obiba.magma.Variable variable) {
    java.lang.String instrumentTypeName = variable.getAttributeStringValue(StageAttributeVisitor.STAGE_ATTRIBUTE);
    if (instrumentTypeName != null) {
        org.obiba.onyx.jade.core.domain.instrument.InstrumentType instrumentType = instrumentService.getInstrumentType(instrumentTypeName);
        if (instrumentType != null) {
            org.obiba.onyx.jade.core.domain.run.InstrumentRun instrumentRun = resolveInstrumentRun(valueSet, variable);
            if (instrumentRun != null) {
                return instrumentType.getContraindication(instrumentRun.getContraindication());
            }
        }
    }
    return null;
}