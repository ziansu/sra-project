com.xenoage.zong.musicxml.types.partwise.MxlPart buildPart() {
    java.util.List<com.xenoage.zong.musicxml.types.partwise.MxlMeasure> partList = new java.util.ArrayList<com.xenoage.zong.musicxml.types.partwise.MxlMeasure>();
    for (int j = 0; j < (scoreDoc.getScore().getMeasuresCount()); j++) {
        partList.add(buildMeasure(j));
    }
    com.xenoage.zong.musicxml.types.partwise.MxlPart mxlPart = new com.xenoage.zong.musicxml.types.partwise.MxlPart(partList, "P1");
    return mxlPart;
}