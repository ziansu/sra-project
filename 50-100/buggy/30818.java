public void addFrameToAnimation() {
    frames.add(cmdAnimator.GameUI.GameCanvas.copy(gui.getScreen()));
    gui.setScreen(null);
    (totalNumberOfFrames)++;
    (cmdAnimator.GameCanvasActions.FrameAnimator.currentFrameNumber)++;
    java.lang.System.out.println(((("current frame num " + (cmdAnimator.GameCanvasActions.FrameAnimator.currentFrameNumber)) + " total frame") + (totalNumberOfFrames)));
    updateCurrentFrameLabel(false);
}