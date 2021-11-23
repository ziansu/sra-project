public jvst.examples.liquinth.SynthesizerPanel initGui() {
    synthesizer = new jvst.examples.liquinth.SynthesizerPanel(synthesizer);
    midiReceiver = new jvst.examples.liquinth.MidiReceiver(synthesizer);
    return ((jvst.examples.liquinth.SynthesizerPanel) (synthesizer));
}