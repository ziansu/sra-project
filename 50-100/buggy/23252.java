public static void main(java.lang.String[] args) throws java.io.IOException, org.json.JSONException {
    DataProvider.CharacterDataProvider test = new DataProvider.CharacterDataProvider("WTBsurvivability", "hardcore");
    java.lang.System.out.println(Parsers.CharacterParser.getAccountNameFromCharacter(test.dataSourceToString()));
    DataProvider.LeagueDataProvider test2 = new DataProvider.LeagueDataProvider();
    java.util.List<java.lang.String> test3 = Parsers.LeagueParser.parseLeagueData(test2.dataSourceToString());
    for (java.lang.String next : test3) {
        java.lang.System.out.println(next);
    }
}