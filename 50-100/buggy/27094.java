@java.lang.Override
public void handle(javafx.event.ActionEvent e) {
    if ((currentFrameIndex) < ((projectObject.animFrameList.size()) - 1)) {
        se.oxidev.animtools64.AnimFrame afCurrent = projectObject.animFrameList.get(currentFrameIndex);
        se.oxidev.animtools64.AnimFrame afNext = projectObject.animFrameList.get(((currentFrameIndex) + 1));
        projectObject.animFrameList.set(currentFrameIndex, afNext);
        projectObject.animFrameList.set(((currentFrameIndex) + 1), afCurrent);
        showFrame(((currentFrameIndex) + 1));
    }
}