public boolean getIsDeadline() {
    return (by.gstu.interviewstreet.web.util.DateUtils.isToday(endDate)) || (by.gstu.interviewstreet.web.util.DateUtils.isMoreThanToday(endDate));
}