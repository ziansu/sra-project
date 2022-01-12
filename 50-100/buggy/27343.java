public cmdAnimator.GameUI.GameCanvas getFrameBasedOnFrameNumber(int frameNumber) {
    if ((((frameNumber - 1) < (totalNumberOfFrames)) && ((frameNumber - 1) >= 0)) && ((frames.get((frameNumber - 1))) != null)) {
        java.lang.System.out.println("got um!");
        return frames.get((frameNumber - 1));
    }else
        return null;
    
}