private org.samcrow.frameviewer.trajectory.Entry<P> findPreviousUserDefined(int frame) {
    int currentFrame = frame - 1;
    while (true) {
        org.samcrow.frameviewer.trajectory.Entry<P> prev = org.samcrow.frameviewer.trajectory.TrackingTrajectory.findPrevious(currentFrame);
        if (prev == null) {
            return null;
        }
        if ((prev.point.getSource()) == (Point.Source.User)) {
            return prev;
        }
        currentFrame = prev.frame;
    } 
}