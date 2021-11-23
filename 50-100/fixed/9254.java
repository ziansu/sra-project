public boolean toggleRecording() {
    if ((state) == (piano.State.isrecording)) {
        state = piano.State.isplaying;
        return false;
    }else
        if ((state) == (piano.State.isplaying)) {
            if (!(listOfNote.isEmpty())) {
                listOfNote.clear();
            }
            state = piano.State.isrecording;
            return true;
        }else {
            return false;
        }
    
}