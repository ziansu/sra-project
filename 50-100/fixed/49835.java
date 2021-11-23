public static void main(java.lang.String[] args) {
    de.muenster.musikhochschule.converter.MusicXMLParser parser = new de.muenster.musikhochschule.converter.MusicXMLParser();
    parser.setExportFolder("nt/");
    parser.setVerbose(false);
    java.io.File[] files = new java.io.File("scores/xmlsamples/").listFiles();
    for (java.io.File file : files) {
        if (file.getName().endsWith(".xml")) {
            parser.loadMusicXML(file);
            parser.exportAsNTriples();
        }
    }
}