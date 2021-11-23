public void fetchProjectInformation() {
    java.lang.String[] midiFileList = getMidiFileList();
    org.catrobat.musicdroid.pocketmusic.note.midi.MidiToProjectConverter midiToProjectConverter = new org.catrobat.musicdroid.pocketmusic.note.midi.MidiToProjectConverter();
    projects.clear();
    if (null != midiFileList) {
        for (java.lang.String aMidiFile : midiFileList) {
            try {
                projects.add(midiToProjectConverter.convertMidiFileToProject(new java.io.File(org.catrobat.musicdroid.pocketmusic.note.midi.ProjectToMidiConverter.MIDI_FOLDER, aMidiFile)));
            } catch (org.catrobat.musicdroid.pocketmusic.note.midi.MidiException | java.io.IOException e) {
                e.printStackTrace();
            }
        }
    }
}