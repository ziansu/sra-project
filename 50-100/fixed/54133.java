public java.util.List<com.betteru.sourcepackage.Progress> getLoggedInUsersProgress() {
    java.util.List<com.betteru.sourcepackage.Progress> progressList;
    if (weekly) {
        progressList = progressFacade.findWeekByUid(getLoggedInUser().getId(), getEndOfWeek(referenceTime));
    }else {
        progressList = progressFacade.findMonthByUid(getLoggedInUser().getId(), getEndOfMonth(referenceTime), numDaysInMonth);
    }
    if (progressList != null) {
        numTicks = progressList.size();
    }
    return progressList;
}