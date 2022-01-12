public boolean needsUpdated() {
    java.util.Calendar cal = java.util.Calendar.getInstance();
    cal.setTime(new java.util.Date());
    cal.add(java.util.Calendar.HOUR_OF_DAY, (-1));
    java.util.Date compare = cal.getTime();
    return (updateTime.getTime()) < (compare.getTime());
}