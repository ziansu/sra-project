public void run() {
    java.lang.System.out.println(JamSessionAutomate.ClipSequencer.counter);
    (JamSessionAutomate.ClipSequencer.counter)++;
    java.lang.System.out.println(JamSessionAutomate.ClipSequencer.sequenceArray);
    for (int i = 0; i < (JamSessionAutomate.ClipSequencer.sequenceArray.size()); i++) {
        if (JamSessionAutomate.ClipSequencer.sequenceArray.get(i)) {
            java.lang.System.out.println(JamSessionAutomate.ClipSequencer.tracks.get(i).getPath());
            JamSessionAutomate.ClipSequencer.tracks.get(i).stop();
            JamSessionAutomate.ClipSequencer.tracks.get(i).play();
        }
    }
}