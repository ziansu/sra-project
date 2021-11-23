protected org.obiba.onyx.jade.core.domain.run.InstrumentRun resolveInstrumentRun(org.obiba.magma.ValueSet valueSet, org.obiba.magma.Variable variable) {
    java.lang.String instrumentTypeName = variable.getAttributeStringValue(StageAttributeVisitor.STAGE_ATTRIBUTE);
    if (instrumentTypeName != null) {
        org.obiba.onyx.core.domain.participant.Participant participant = getParticipant(valueSet);
        if (participant != null) {
            return instrumentRunService.getInstrumentRun(participant, instrumentTypeName);
        }
    }
    return null;
}