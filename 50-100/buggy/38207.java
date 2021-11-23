public void run() {
    int pitch = model.getCurPitch();
    int beat = model.getCurBeat();
    try {
        cs3500.music.controller.Note n = model.getNoteIn(new cs3500.music.controller.PitchImpl(pitch), beat);
        model.editNoteEndTime(new cs3500.music.controller.PitchImpl(pitch), n.getStartTime(), ((n.getEndTime()) + 1), n.getInstrument());
    } catch (cs3500.music.controller.Model ex) {
    }
    view.render(model);
}