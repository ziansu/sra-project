private java.lang.String getDataFields(org.xcolab.client.proposals.pojo.Proposal proposal) {
    java.lang.StringBuilder dataFields = new java.lang.StringBuilder(org.xcolab.view.pages.proposals.judging.ProposalReviewCsvExporter.TQF);
    for (org.xcolab.client.contest.pojo.templates.PlanSectionDefinition sectionDefinition : contest.getSections()) {
        if (sectionDefinition.getIncludeInJudgingReport()) {
            dataFields.append("\"").append(escapeQuote(org.xcolab.util.html.HtmlUtil.cleanAll(sectionDefinition.getContent()))).append("\"").append(org.xcolab.view.pages.proposals.judging.ProposalReviewCsvExporter.delimiter);
        }
    }
    return dataFields.toString();
}