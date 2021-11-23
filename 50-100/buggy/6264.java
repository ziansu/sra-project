public static void main(java.lang.String[] args) {
    de.muenster.musikhochschule.converter.MusicXMLParser parser = new de.muenster.musikhochschule.converter.MusicXMLParser();
    parser.loadMusicXML(new java.io.File("scores/xmlsamples/BeetAnGeSample.xml"));
    parser.setExportFolder("nt/");
    parser.setVerbose(false);
    parser.exportAsNTriples();
}