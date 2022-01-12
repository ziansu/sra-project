@java.lang.Override
public au.edu.jcu.v4l4j.VideoFrame encode(au.edu.jcu.v4l4j.BaseVideoFrame frame) throws au.edu.jcu.v4l4j.exceptions.V4L4JException {
    au.edu.jcu.v4l4j.encoder.AbstractConvertedVideoFrame outFrame = availableFrames.poll();
    this.putBuffer(this.object, frame.getBytes(), frame.getFrameLength());
    this.doConvert(this.object);
    int length = this.getBuffer(this.object, outFrame.getBytes());
    outFrame.prepareForDelivery(length, 0, frame.getSequenceNumber(), frame.getCaptureTime());
    return outFrame;
}