@java.lang.Override
public void unpackFromService(java.lang.Class service, android.content.Intent restoreIntent) {
    if (service != (dmangames.team4.reap.services.TimerService.class))
        return ;
    
    java.lang.String name = restoreIntent.getStringExtra(dmangames.team4.reap.objects.ActivityObject.KEY_ACTIVITYOBJ_NAME);
    activityObject = blob.getActivity(name);
    if ((activityObject) == null)
        activityObject = data.getBreakByName(name);
    
    pomodoroBreak = restoreIntent.getBooleanExtra(dmangames.team4.reap.fragments.TimerFragment.KEY_TIMER_BREAK, false);
    activityObject.addTimeSpent(((restoreIntent.getLongExtra(dmangames.team4.reap.objects.ActivityObject.KEY_ACTIVITYOBJ_SPENT, 0)) - 1));
    timer.unpack(restoreIntent);
}