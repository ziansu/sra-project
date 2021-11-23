public void run() {
    java.lang.System.out.println(JamSessionAutomate.ClipSequencer.counter);
    (JamSessionAutomate.ClipSequencer.counter)++;
    for (int i = 0; i < (JamSessionAutomate.ClipSequencer.sequenceArray.size()); i++) {
        if (JamSessionAutomate.ClipSequencer.sequenceArray.get(i)) {
            JamSessionAutomate.ClipSequencer.tracks.get(i).stop();
            JamSessionAutomate.ClipSequencer.tracks.get(i).play();
        }
    }
}