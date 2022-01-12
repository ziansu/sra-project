public void exportCompositionAsMidiFile(proj10BeckChanceRemondiSalerno.Composition composition) throws java.io.IOException {
    java.io.File file = midiFileChooser.showSaveDialog(proj10BeckChanceRemondiSalerno.Main.getPrimaryStage());
    javax.sound.midi.Sequence sequence = createSequence(composition.getNotes());
    int[] writers = javax.sound.midi.MidiSystem.getMidiFileTypes(sequence);
    if ((writers.length) == 0)
        return ;
    
    javax.sound.midi.MidiSystem.write(sequence, writers[0], new java.io.FileOutputStream(file));
    return ;
}