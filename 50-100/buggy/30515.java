@org.junit.Test
public void testWithFullContentButOnlyOneValidMatchOutOf5() {
    java.lang.String content = com.bet.manager.commons.util.ClasspathUtils.getContentUTF8("live-score-full-content-with-only-one-valid-match.txt");
    java.util.List<com.bet.manager.models.dao.FootballMatch> actual = com.bet.manager.core.data.sources.it.LiveScoreMatchParserIT.parser.parse(content);
    com.bet.manager.models.dao.FootballMatch expected = createMatch("Manchester City", "Everton", "January 13 2016 21:45");
    org.junit.Assert.assertEquals(actual.size(), 1);
    org.junit.Assert.assertTrue(com.bet.manager.core.data.sources.it.FootballMatchUtils.equals(actual.get(0), expected));
}