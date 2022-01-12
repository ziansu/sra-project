private imp.lickgen.transformations.Transform learnByTrendDetection() {
    notate.adjustSelection();
    int start = notate.getCurrentSelectionStart();
    int stop = notate.getCurrentSelectionEnd();
    imp.data.MelodyPart outline = notate.getCurrentMelodyPart();
    imp.data.ChordPart chords = notate.getChordProg();
    imp.lickgen.transformations.Transform result = transformLearning.createTrendTransform(outline, original.copy(), chords, start, stop);
    return result;
}