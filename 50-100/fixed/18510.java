private void loadEditableSchedule() throws java.sql.SQLException {
    java.util.List<java.lang.String> clinicianNames = clinicianDao.loadClinicianNames();
    this.weekA = new gui.admin.scheduleviewer.IAWeeklyComponent(schedule.getIASessionsA(), clinicianNames, bean.IAWeektype.A, schedule);
    this.weekB = new gui.admin.scheduleviewer.IAWeeklyComponent(schedule.getIASessionsB(), clinicianNames, bean.IAWeektype.B, schedule);
    this.panel.setLeftComponent(weekA);
    this.panel.setRightComponent(weekB);
    repaint();
}