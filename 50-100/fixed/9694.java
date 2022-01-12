@java.lang.Override
public void onDepthFrameEvent(short[] depthFrame, byte[] playerIndex, float[] xyz, float[] uv) {
    if ((this.lock) != null) {
        synchronized(this.lock) {
            this.lock.notifyAll();
            this.lock = null;
        }
    }
    de.gocodinggroup.multiplicationtable.input.kinect.EventManager.dispatchAndWait(new de.gocodinggroup.multiplicationtable.input.kinect.KinectDepthFrameEvent(depthFrame, xyz));
}