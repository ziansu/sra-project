@java.lang.Override
public java.util.List<an.dpr.cyclingresultsapi.domain.ResultRow> getResults(an.dpr.cyclingresultsapi.domain.Competition competition) {
    java.util.List<an.dpr.cyclingresultsapi.domain.ResultRow> list = repo.findByCompetition(competition);
    java.util.Collections.sort(list);
    return list;
}