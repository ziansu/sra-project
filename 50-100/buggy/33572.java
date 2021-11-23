@java.lang.Override
public void update(java.util.Observable o, java.lang.Object arg) {
    if (o instanceof grooveberryserver.audiofile.AudioFile) {
        java.lang.String state = ((java.lang.String) (arg));
        if (state.equals("EndOfPlay")) {
            endOfPlay();
        }else
            if (state.equals("StopOfPlay")) {
                stopOfPlay();
            }
        
    }
}