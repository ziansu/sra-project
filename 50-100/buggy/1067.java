@java.lang.Override
public void valueChanged(javax.swing.event.ListSelectionEvent e) {
    int row = keyFramesTable.getSelectedRow();
    if ((ModelCreator.currentProject.SelectedAnimation) != null) {
        at.vintagestory.modelcreator.model.Keyframe keyframe = ModelCreator.currentProject.SelectedAnimation.keyframes[row];
        ModelCreator.currentProject.SelectedAnimation.SetFrame(keyframe.getFrameNumber());
        at.vintagestory.modelcreator.ModelCreator.updateFrame();
    }
}