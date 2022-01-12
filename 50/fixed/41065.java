private static boolean isContestSchedulesAvailable() throws java.lang.Exception {
    return (org.xcolab.portlets.contestmanagement.wrappers.ContestScheduleLocalServiceUtil.getContestSchedulesCount()) > 1;
}