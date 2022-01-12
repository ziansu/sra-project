public org.md2k.study.Status getCurrentStatusDetails() {
    if (isNewDay()) {
        org.md2k.utilities.Report.Log.d(org.md2k.study.model_view.day_start_end.DayStartEndInfoManager.TAG, ("rank=" + (rank)));
        set();
        return new org.md2k.study.Status(rank, org.md2k.study.Status.DAY_START_NOT_AVAILABLE);
    }
    if ((dayEndTime) > (dayStartTime))
        return new org.md2k.study.Status(rank, org.md2k.study.Status.DAY_COMPLETED);
    
    return new org.md2k.study.Status(rank, org.md2k.study.Status.SUCCESS);
}