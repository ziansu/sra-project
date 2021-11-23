private imp.lickgen.transformations.Transform learnByWindowing() {
    notate.adjustSelection();
    int start = notate.getCurrentSelectionStart();
    int stop = notate.getCurrentSelectionEnd();
    imp.data.MelodyPart outline = notate.getCurrentMelodyPart();
    imp.data.ChordPart chords = notate.getChordProg();
    int res = getResolution(windowResolutionComboBox.getSelectedItem().toString());
    imp.lickgen.transformations.Transform transform = transformLearning.createBlockTransform(outline, original.copy(), chords, start, stop, res);
    return transform;
}