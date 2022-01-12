private org.samcrow.frameviewer.trajectory.Entry<P> findNextUserDefined(int frame) {
    int currentFrame = frame + 1;
    while (true) {
        org.samcrow.frameviewer.trajectory.Entry<P> next = org.samcrow.frameviewer.trajectory.TrackingTrajectory.findNext(currentFrame);
        if (next == null) {
            return null;
        }
        if ((next.point.getSource()) == (Point.Source.User)) {
            return next;
        }
        currentFrame = next.frame;
    } 
}