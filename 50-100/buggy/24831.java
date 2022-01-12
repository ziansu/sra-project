public void run() {
    int pitch = model.getCurPitch();
    int beat = model.getCurBeat();
    if ((beat != (-1)) && (pitch != (-1))) {
        model.addNote(new cs3500.music.controller.PitchImpl(pitch), beat, (beat + 2), 1, 80);
        model.setCurPitch((-1));
        model.setCurBeat((-1));
    }
    view.update(beat);
}