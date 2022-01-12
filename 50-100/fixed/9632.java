public void setFrequencyDays(java.lang.String daysBitString) {
    frequencyDays = daysBitString;
    java.util.Calendar calendar = java.util.Calendar.getInstance();
    int today = (calendar.get(java.util.Calendar.DAY_OF_WEEK)) - 1;
    if (frequencyDays.substring(today, (today + 1)).equals("1")) {
        isToday = true;
    }else {
        isToday = false;
    }
}