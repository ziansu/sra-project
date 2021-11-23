protected static int getDateContextValueForDate(java.util.List<java.util.Date> dateList, java.util.Date date) {
    for (int i = 0; i < (dateList.size()); i++) {
        if (dateList.get(i).equals(date)) {
            return i + 1;
        }
    }
    return 0;
}