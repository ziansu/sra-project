public void notePlayStop(int lane, int player) {
    if ((pitchesAtLane.get(lane)) != null) {
        for (int pitch : pitchesAtLane.get(lane)) {
            synth.noteOff(pitch);
        }
        pitchesAtLane.put(lane, null);
    }
}