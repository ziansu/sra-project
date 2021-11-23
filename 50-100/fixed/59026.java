@java.lang.SuppressWarnings(value = "synthetic-access")
@java.lang.Override
public void onMessage(@javax.annotation.Nonnull
final org.csstudio.alarm.service.declaration.IAlarmMessage message) {
    if ((message.getString(AlarmMessageKey.ACK)) == null) {
        _alarmSoundService.playAlarmSound(message.getString(AlarmMessageKey.SEVERITY));
    }else
        if (!(message.getString(AlarmMessageKey.ACK).equals("true"))) {
            _alarmSoundService.playAlarmSound(message.getString(AlarmMessageKey.SEVERITY));
        }
    
}