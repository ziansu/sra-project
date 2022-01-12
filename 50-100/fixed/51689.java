void addNewPart(java.lang.String instrName, int staffSpan, com.xenoage.zong.core.Score comp) {
    com.xenoage.zong.core.instrument.Instrument instr = com.xenoage.zong.core.instrument.Instrument.defaultInstrument;
    com.xenoage.zong.core.music.Part part = new com.xenoage.zong.core.music.Part(instrName, null, staffSpan, com.xenoage.utils.collections.CollectionUtils.alist(instr));
    new com.xenoage.zong.commands.core.music.PartAdd(comp, part, 0, null).execute();
    cursorList.add(((parts)++), new io_handler.Quill(new com.xenoage.zong.io.selection.Cursor(currentComp, com.xenoage.zong.core.position.MP.mp(1, 0, 0, com.xenoage.utils.math.Fraction._0, 0), true)));
}