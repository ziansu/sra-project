public static void updateDatabase(android.content.Context context) throws java.io.IOException, java.net.MalformedURLException, java.text.ParseException {
    com.mygdq.activity.model.GDQScraper.scrape(context);
    com.mygdq.activity.model.GDQScraper.runs = com.mygdq.activity.model.GDQScraper.findListOfRuns();
    try (com.mygdq.db.model.DBMapperAdapter mapper = new com.mygdq.db.model.run.RunMapper(context)) {
        ((com.mygdq.db.model.run.RunMapper) (mapper)).truncateTable();
        for (com.mygdq.db.model.run.Run run : com.mygdq.activity.model.GDQScraper.runs) {
            ((com.mygdq.db.model.run.RunMapper) (mapper)).insert(run);
        }
    } catch (java.lang.Exception e) {
    }
}