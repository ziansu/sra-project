private de.dengot.skyrim.reporting.worker.TemplateMergeWorkload createCategorySummaryFramePayload(de.dengot.skyrim.model.StatisticCategory category, de.dengot.skyrim.model.SkyrimCharacterList characters) {
    org.apache.velocity.Template template = loadTemplate("category-summarypage.vm");
    org.apache.velocity.VelocityContext context = new org.apache.velocity.VelocityContext();
    context.put("cat", category);
    context.put("playerMaxValueTable", createSummaryTable(characters, java.util.Collections.singleton(category)));
    java.io.File outputFile = new java.io.File(this.outputFolder, (("frame-summary-" + (category.getName())) + ".html"));
    return new de.dengot.skyrim.reporting.worker.TemplateMergeWorkload(template, context, outputFile);
}