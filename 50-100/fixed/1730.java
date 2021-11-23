public java.lang.Float getScore() {
    if ((entries.size()) == 0) {
        return null;
    }
    java.lang.Float score = com.inovia.magnifier.reports.RuleReport.MIN_SCORE;
    for (com.inovia.magnifier.reports.ReportEntry e : entries) {
        if (e.isSuccess()) {
            score++;
        }
    }
    return (score * (com.inovia.magnifier.reports.RuleReport.MAX_SCORE)) / ((float) (entries.size()));
}