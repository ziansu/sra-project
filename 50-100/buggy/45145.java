public void notePlayStop(int lane, int player) {
    java.lang.System.out.println(player);
    if ((pitchesAtLane.get(lane)) != null) {
        for (int pitch : pitchesAtLane.get(lane)) {
            synth.noteOff(pitch);
        }
        pitchesAtLane.put(lane, null);
    }
}