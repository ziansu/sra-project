public scrum.client.release.Release createNewRelease(scrum.client.release.Release parentRelease) {
    ilarkesto.core.time.Date date = ilarkesto.core.time.Date.today();
    scrum.client.release.Release release = scrum.client.release.Release.post(this, date);
    if (parentRelease != null) {
        release.setParentRelease(parentRelease);
        release.setLabel(createBugfixLabel(parentRelease));
        ilarkesto.core.time.Date parentDate = parentRelease.getReleaseDate();
        if ((parentDate != null) && (parentDate.isAfter(date)))
            release.setReleaseDate(parentDate);
        
    }
    return release;
}