private static void printToXMLFile(java.io.File outFile, pcgen.facade.core.CharacterFacade character) throws java.io.IOException, pcgen.io.ExportException {
    final java.io.BufferedWriter bw = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(outFile), "UTF-8"));
    java.io.File template = pcgen.system.BatchExporter.getXMLTemplate(character);
    character.export(new pcgen.io.ExportHandler(template), bw);
    bw.close();
}