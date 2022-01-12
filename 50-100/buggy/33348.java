private void writeMainSummaryFrame(de.dengot.skyrim.model.SkyrimCharacterList characters) throws java.io.IOException {
    org.apache.velocity.Template template = loadTemplate("frame-summary.vm");
    org.apache.velocity.VelocityContext context = new org.apache.velocity.VelocityContext();
    context.put("playerMaxValueTable", createSummaryTable(characters, statCatProvider.getCategories()));
    java.io.FileWriter writer = new java.io.FileWriter(new java.io.File(this.outputFolder, "frame-summary.html"));
    template.merge(context, writer);
    writer.flush();
    writer.close();
}