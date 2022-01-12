@java.lang.Override
public void writeModelToFile(java.lang.String basepath) {
    java.io.File outputPath = new java.io.File(basepath, ((super.model.getSystemName()) + ".xml"));
    super.model.writeModelToFile(outputPath.getAbsolutePath());
}