com.xenoage.zong.musicxml.types.partwise.MxlPart buildPart(int staffIndex) {
    io_handler.Staff staff = scoreDoc.getScore().getStaff(staffIndex);
    java.util.List<com.xenoage.zong.musicxml.types.partwise.MxlMeasure> partList = new java.util.ArrayList<com.xenoage.zong.musicxml.types.partwise.MxlMeasure>();
    for (int i = 0; i < (scoreDoc.getScore().getMeasuresCount()); i++)
        partList.add(buildMeasure(staff.getMeasure(i), (i + 1)));
    
    com.xenoage.zong.musicxml.types.partwise.MxlPart mxlPart = new com.xenoage.zong.musicxml.types.partwise.MxlPart(partList, "P1");
    return mxlPart;
}