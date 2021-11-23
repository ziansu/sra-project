private static void runAnalysis(java.lang.String wikiLink) {
    java.lang.String articleName = comphuman.task2.distanceReading.RunnerHelper.extractArticleName(wikiLink);
    java.lang.String linkToDiscussion = comphuman.task2.distanceReading.RunnerHelper.extractDiscussionLink(wikiLink);
    java.lang.String linkToHisDiscussion = comphuman.task2.distanceReading.RunnerHelper.extractHisDiscussionLink(linkToDiscussion);
    comphuman.task2.distanceReading.GermanWikiArticleDiscussionAnalyzer articleAna = new comphuman.task2.distanceReading.GermanWikiArticleDiscussionAnalyzer(linkToDiscussion, articleName);
    articleAna.runAnalyses();
    articleAna.visTheResults();
    comphuman.task2.distanceReading.GermanWikiArticleDiscussionHistoryAnalyzer hisAna = new comphuman.task2.distanceReading.GermanWikiArticleDiscussionHistoryAnalyzer(linkToHisDiscussion, articleName);
    hisAna.startAnalyser();
}