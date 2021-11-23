private void updateContestsUsingSchedule(java.lang.Long contestScheduleId) throws java.lang.Exception {
    java.util.List<org.xcolab.portlets.contestmanagement.wrappers.Contest> contestsUsingScheduleId = org.xcolab.portlets.contestmanagement.wrappers.ContestLocalServiceUtil.getContestsByContestScheduleId(contestScheduleId);
    for (org.xcolab.portlets.contestmanagement.wrappers.Contest contest : contestsUsingScheduleId) {
        updateContestPhasesOfContestAccordingToContestSchedule(contest, contestScheduleId);
    }
}