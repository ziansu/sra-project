public void addNew(uk.ac.ucl.excites.sapelli.collector.transmission.SendSchedule schedule) {
    if (schedule != null) {
        schedule.setEnabled(true);
        save(schedule, true);
        refresh();
    }else
        toggleConfigGroup(true, (!(listScheduleAdapter.isEmpty())));
    
}