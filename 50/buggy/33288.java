@java.lang.Override
public java.lang.String executePlugin(java.nio.file.Path inputPath, java.nio.file.Path outputPath, java.lang.String fileFormat) throws java.io.IOException, java.lang.UnsupportedOperationException, org.roda.core.util.CommandException {
    try {
        return org.roda.core.plugins.plugins.conversion.PdfToPdfaPluginUtils.executePdfToPdfa(inputPath, outputPath, org.roda.core.plugins.plugins.conversion.PdfToPdfaPlugin.validatePDF);
    } catch (org.verapdf.core.VeraPDFException | org.ghost4j.GhostscriptException e) {
        return null;
    }
}