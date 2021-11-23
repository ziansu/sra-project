@java.lang.Override
public void handle(javafx.event.ActionEvent e) {
    if ((currentFrameIndex) > 0) {
        se.oxidev.animtools64.AnimFrame afCurrent = projectObject.animFrameList.get(currentFrameIndex);
        projectObject.animFrameList.set(currentFrameIndex, projectObject.animFrameList.get(((currentFrameIndex) - 1)));
        projectObject.animFrameList.set(((currentFrameIndex) - 1), afCurrent);
        showFrame(((currentFrameIndex) - 1));
    }
}