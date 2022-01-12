@org.junit.Test
public void test_discover_tv() throws java.text.ParseException {
    com.uwetrottmann.tmdb.entities.TvResultsPage results = getManager().discoverService().discoverTv(null, null, SortBy.VOTE_AVERAGE_DESC, null, new com.uwetrottmann.tmdb.entities.AppendToDiscoverResponse(18, 10765), new com.uwetrottmann.tmdb.entities.AppendToDiscoverResponse(49), com.uwetrottmann.tmdb.services.DiscoverServiceTest.JSON_STRING_DATE.parse("2010-01-01"), com.uwetrottmann.tmdb.services.DiscoverServiceTest.JSON_STRING_DATE.parse("2014-01-01"));
    assertResultsPage(results);
    org.assertj.core.api.Assertions.assertThat(results.results).isNotEmpty();
}