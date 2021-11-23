protected org.obiba.onyx.jade.core.domain.run.InstrumentRunValue getInstrumentRunValue(org.obiba.magma.ValueSet valueSet, org.obiba.onyx.jade.core.domain.instrument.InstrumentType instrumentType, org.obiba.onyx.jade.core.domain.instrument.InstrumentParameter instrumentParameter) {
    org.obiba.onyx.core.domain.participant.Participant participant = getParticipant(valueSet);
    return participant == null ? null : instrumentRunService.getInstrumentRunValue(participant, instrumentType.getName(), instrumentParameter.getCode(), null);
}