private java.lang.String GetCurrentCheckInDate(java.util.List<java.lang.String> checkInTimeList) {
    for (int idx = 0; idx < (checkInTimeList.size()); idx++) {
        if ((com.Warcraft.SupportUnit.DateAdapter.TimeSpan(checkInTimeList.get(idx), "12:00:00")) > 0)
            return checkInTimeList.get(idx);
        
    }
    return null;
}