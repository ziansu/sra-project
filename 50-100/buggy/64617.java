@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.System.out.println("New Button pressed");
    if ((currentRecordingState) == (com.github.stevewhit.mouserecorder.ui.MouseRecorderGUI.RecordingStates.Disable)) {
        resetPlaybackOptionsAndQueue();
    }else
        if ((currentPlaybackState) == (com.github.stevewhit.mouserecorder.ui.MouseRecorderGUI.PlaybackStates.Disable)) {
            resetRecordingActionsTextArea(true, true, true);
        }
    
}