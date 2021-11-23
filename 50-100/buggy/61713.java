private void writeCategoriesFrame() throws java.io.IOException {
    org.apache.velocity.Template template = loadTemplate("frame-categories.vm");
    org.apache.velocity.VelocityContext context = new org.apache.velocity.VelocityContext();
    context.put("categories", statCatProvider.getCategories());
    java.io.FileWriter writer = new java.io.FileWriter(new java.io.File(this.outputFolder, "frame-categories.html"));
    template.merge(context, writer);
    writer.flush();
    writer.close();
}