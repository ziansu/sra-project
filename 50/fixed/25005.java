public static java.util.ArrayList<sstinc.skeem.models.Schedulable> filterSchedule(java.util.ArrayList<sstinc.skeem.models.Schedulable> unfilteredSchedule) {
    java.util.ArrayList<sstinc.skeem.models.Schedulable> schedule = unfilteredSchedule;
    schedule = sstinc.skeem.schedule.Scheduler.removeTimeblocks(schedule);
    return schedule;
}