@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    switch (currentState) {
        case com.prototype.videorecorder.VideoRecorder.ON_WITH_TAPE :
            currentState = com.prototype.videorecorder.VideoRecorder.REWINDED_FAST;
            break;
        case com.prototype.videorecorder.VideoRecorder.NORMAL_SPEED :
            currentState = com.prototype.videorecorder.VideoRecorder.REWINDED;
            break;
        case com.prototype.videorecorder.VideoRecorder.PAUSED :
            currentState = com.prototype.videorecorder.VideoRecorder.FAST_SPEED_FAST;
            break;
    }
    updateStateLabel();
}