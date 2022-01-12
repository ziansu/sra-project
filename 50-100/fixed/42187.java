public static void printToXMLFile(java.io.File outFile, pcgen.facade.core.PartyFacade party) throws java.io.IOException, pcgen.io.ExportException {
    final java.io.BufferedWriter bw = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(outFile), "UTF-8"));
    for (pcgen.facade.core.CharacterFacade character : party) {
        java.io.File templateFile = pcgen.system.BatchExporter.getXMLTemplate(character);
        character.export(new pcgen.io.ExportHandler(templateFile), bw);
    }
    bw.close();
}