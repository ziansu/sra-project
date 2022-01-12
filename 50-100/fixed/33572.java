@java.lang.Override
public void update(java.util.Observable o, java.lang.Object arg) {
    if (o instanceof grooveberryserver.audiofile.AudioFile) {
        java.lang.String state = ((java.lang.String) (arg));
        if ("EndOfPlay".equals(state)) {
            endOfPlay();
        }else
            if ("StopOfPlay".equals(state)) {
                stopOfPlay();
            }
        
    }
}