public long getReleaseIdBySprintId(long sprintId) {
    long releaseId = -1;
    java.util.ArrayList<ntut.csie.ezScrum.web.dataObject.ReleaseObject> releases = mReleasePlanMapper.getReleases();
    for (ntut.csie.ezScrum.web.dataObject.ReleaseObject release : releases) {
        ntut.csie.ezScrum.web.dataObject.SprintObject sprint = ntut.csie.ezScrum.web.dataObject.SprintObject.get(sprintId);
        if (release.containsSprint(sprint)) {
            return release.getId();
        }
    }
    return releaseId;
}