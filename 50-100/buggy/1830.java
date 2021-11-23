public monasca.api.domain.model.alarm.Alarm update(java.lang.String tenantId, java.lang.String alarmId, monasca.api.app.command.UpdateAlarmCommand command) {
    monasca.api.domain.model.alarm.Alarm alarm = repo.findById(alarmId);
    updateInternal(tenantId, alarm, alarm.getState(), command.state);
    alarm.setState(command.state);
    return alarm;
}