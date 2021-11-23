@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.galaxy.voicealarm.VoiceAlarmApplication.context = this;
    com.galaxy.voicealarm.VoiceAlarmApplication.settingMemoList();
    com.galaxy.voicealarm.VoiceAlarmApplication.memoList.put("2016-09-29", new com.galaxy.voicealarm.Memo(1, "2016-09-29", "Sample"));
}