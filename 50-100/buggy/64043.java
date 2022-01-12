public void annotateSentence(czsem.gate.externalannotator.Annotator.Sentence s) throws gate.util.InvalidOffsetException {
    if (safeAnnotateSeq(s)) {
        seq_anot.restoreToLastStartAndBackupCurrent();
        addSplitAnnotation();
    }else {
        seq_anot.restorePreviousAndBackupCurrent();
    }
    safeAnnotateIterableSeq(s.getOrderedTokens());
    s.annotateSecondaryEntities(this);
    seq_anot.restorePreviousAndBackupCurrent();
}