@java.lang.Override
public au.edu.jcu.v4l4j.VideoFrame encode(au.edu.jcu.v4l4j.BaseVideoFrame frame) throws au.edu.jcu.v4l4j.exceptions.V4L4JException {
    au.edu.jcu.v4l4j.encoder.AbstractConvertedVideoFrame outFrame = availableFrames.poll();
    this.putBuffer(frame.getBytes(), frame.getFrameLength());
    this.doConvert();
    int length = this.getBuffer(outFrame.getBytes());
    outFrame.prepareForDelivery(length, 0, frame.getSequenceNumber(), frame.getCaptureTime());
    return outFrame;
}