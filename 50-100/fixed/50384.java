public void updateEntries(com.example.brandon.habitlogger.data.DataModels.DataCollections.SessionEntryCollection dataSample) {
    if (!(dataSample.isEmpty())) {
        java.util.Set<java.lang.Long> uniqueEntryStartDates = com.example.brandon.habitlogger.common.MyCollectionUtils.collectIntoSet(dataSample.asList(), SessionEntry.IGetSessionStartDate);
        int totalDaysWithEntries = uniqueEntryStartDates.size();
        int totalDays = dataSample.calculateTotalDaysLength();
        float ratio = (totalDaysWithEntries / ((float) (totalDays))) * 100;
        mStatisticData = new com.example.brandon.habitlogger.ui.Activities.HabitDataActivity.Fragments.StatisticsFragments.PieGraphCompletion.StatisticData(totalDaysWithEntries, totalDays, ratio);
        setPieData(mStatisticData);
    }
}