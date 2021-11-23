@java.lang.Override
public java.util.List<an.dpr.cyclingresultsapi.domain.ResultRow> getResults(an.dpr.cyclingresultsapi.domain.Competition competition) {
    return repo.findByCompetition(competition);
}