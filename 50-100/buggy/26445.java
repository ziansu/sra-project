public monasca.api.domain.model.alarm.Alarm patch(java.lang.String tenantId, java.lang.String alarmId, monasca.common.model.alarm.AlarmState state) {
    monasca.api.domain.model.alarm.Alarm alarm = repo.findById(alarmId);
    state = (state == null) ? alarm.getState() : state;
    updateInternal(tenantId, alarm, alarm.getState(), state);
    alarm.setState(state);
    return alarm;
}