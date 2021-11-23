protected org.obiba.onyx.jade.core.domain.run.InstrumentRunValue getInstrumentRunValue(org.obiba.magma.ValueSet valueSet, org.obiba.onyx.jade.core.domain.instrument.InstrumentType instrumentType, org.obiba.onyx.jade.core.domain.instrument.InstrumentParameter instrumentParameter) {
    org.obiba.onyx.core.domain.participant.Participant participant = getParticipant(valueSet);
    if (participant != null) {
        return instrumentRunService.getInstrumentRunValue(participant, instrumentType.getName(), instrumentParameter.getCode(), null);
    }
    return null;
}