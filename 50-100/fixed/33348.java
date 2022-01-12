private void writeMainSummaryFrame(de.dengot.skyrim.model.SkyrimCharacterList characters) throws java.io.IOException {
    org.apache.velocity.VelocityContext context = new org.apache.velocity.VelocityContext();
    context.put("playerMaxValueTable", createSummaryTable(characters, statCatProvider.getCategories()));
    java.io.FileWriter writer = new java.io.FileWriter(new java.io.File(this.outputFolder, "frame-summary.html"));
    loadTemplate("frame-summary.vm").merge(context, writer);
    writer.flush();
    writer.close();
}