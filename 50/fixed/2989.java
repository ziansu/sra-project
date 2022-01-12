public void sortSchedules(com.example.myothiha09.coursehelper.model.GenericComparator comparator, java.util.List<com.example.myothiha09.coursehelper.model.Schedule> schedules) {
    nestedLayout.removeAllViewsInLayout();
    com.example.myothiha09.coursehelper.model.ScheduleSorter.sort(schedules, comparator);
    displaySchedules(schedules);
}