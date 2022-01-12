private void addOpenTimeToList(dev.wisebite.wisebite.domain.OpenTime openTime) {
    java.util.Calendar calendar = java.util.Calendar.getInstance();
    calendar.setTime(openTime.getStartDate());
    java.lang.Integer dayOfOpenTime = calendar.get(java.util.Calendar.DAY_OF_WEEK);
    for (dev.wisebite.wisebite.domain.OpenTime time : this.openTimes) {
        calendar.setTime(time.getStartDate());
        if ((calendar.get(java.util.Calendar.DAY_OF_WEEK)) == dayOfOpenTime)
            return ;
        
    }
    this.openTimes.add(openTime);
}