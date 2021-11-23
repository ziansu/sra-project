protected org.obiba.onyx.jade.core.domain.run.InstrumentRun resolveInstrumentRun(org.obiba.magma.ValueSet valueSet, org.obiba.magma.Variable variable) {
    java.lang.String instrumentTypeName = variable.getAttributeStringValue(StageAttributeVisitor.STAGE_ATTRIBUTE);
    if (instrumentTypeName == null)
        return null;
    
    org.obiba.onyx.core.domain.participant.Participant participant = getParticipant(valueSet);
    return participant == null ? null : instrumentRunService.getInstrumentRun(participant, instrumentTypeName);
}