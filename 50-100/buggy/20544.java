void buildXmlScore() {
    java.util.List<com.xenoage.zong.musicxml.types.partwise.MxlPart> parts = new java.util.ArrayList<com.xenoage.zong.musicxml.types.partwise.MxlPart>();
    if ((scoreDoc.getScore().getStavesCount()) > 1)
        java.lang.System.out.println("MORE THAN ONE STAFF");
    
    for (int i = 0; i < (scoreDoc.getScore().getStavesCount()); i++)
        parts.add(buildPart(i));
    
    java.lang.String version = "1.0";
    xmlDoc = new com.xenoage.zong.musicxml.MusicXMLDocument(new io_handler.MxlScorePartwise(buildMeta(), parts, version));
}