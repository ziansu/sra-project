private de.dengot.skyrim.reporting.worker.TemplateMergeWorkload createStatNamesFramePayload(de.dengot.skyrim.model.StatisticCategory category) throws java.io.IOException {
    org.apache.velocity.VelocityContext context = new org.apache.velocity.VelocityContext();
    context.put("statNames", category.getStatNames());
    java.io.File outputFile = new java.io.File(this.outputFolder, (("frame-" + (category.getName())) + ".html"));
    return new de.dengot.skyrim.reporting.worker.TemplateMergeWorkload(loadTemplate("frame-category-content.vm"), context, outputFile);
}