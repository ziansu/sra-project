public void playNote(int tempo, java.util.List<java.lang.Integer[]> notes, int length) throws javax.sound.midi.InvalidMidiDataException {
    this.sequencer.setSequence(createSequence(tempo, notes));
    this.sequencer.addMetaEventListener(new javax.sound.midi.MetaEventListener() {
        @java.lang.Override
        public void meta(javax.sound.midi.MetaMessage meta) {
            if ((meta.getType()) == 47)
                sequencer.close();
            
        }
    });
    this.sequencer.start();
    this.sequencer.setTempoInMPQ(tempo);
}