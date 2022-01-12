public void annotateSentence(czsem.gate.externalannotator.Annotator.Sentence s) throws gate.util.InvalidOffsetException {
    if (safeAnnotateSeq(s)) {
        addSplitAnnotation();
        seq_anot.restoreToLastStartAndBackupCurrent();
    }else {
        seq_anot.restorePreviousAndBackupCurrent();
    }
    safeAnnotateIterableSeq(s.getOrderedTokens());
    s.annotateSecondaryEntities(this);
    seq_anot.restorePreviousAndBackupCurrent();
}