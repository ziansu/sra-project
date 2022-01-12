public jvst.examples.liquinth.SynthesizerPanel initGui() {
    if (!((synthesizer) instanceof jvst.examples.liquinth.SynthesizerPanel)) {
        synthesizer = new jvst.examples.liquinth.SynthesizerPanel(synthesizer);
        midiReceiver = new jvst.examples.liquinth.MidiReceiver(synthesizer);
    }
    return ((jvst.examples.liquinth.SynthesizerPanel) (synthesizer));
}