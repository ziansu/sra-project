protected void parseRangeAndUpdate(java.util.Date startDate, java.util.Date endDate, java.lang.String directory, com.github.longkerdandy.qfii.hkex.storage.PostgreStorage storage) throws java.io.IOException, java.text.ParseException {
    while ((startDate.before(endDate)) || (startDate.equals(endDate))) {
        parseAndUpdate(startDate, directory, storage);
        startDate = org.apache.commons.lang3.time.DateUtils.addDays(startDate, 1);
    } 
}