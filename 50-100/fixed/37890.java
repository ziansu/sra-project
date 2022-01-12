private SimpleVideoComponent createVideoComponent(int port, int width, int height) {
    SimpleVideoComponent vc = new SimpleVideoComponent();
    org.freedesktop.gstreamer.Bin bin = org.freedesktop.gstreamer.Bin.launch((("udpsrc port=" + port) + " ! application/x-rtp, payload=96 ! rtph264depay ! avdec_h264 ! videoconvert"), true);
    pipe = new org.freedesktop.gstreamer.Pipeline();
    pipe.addMany(bin, vc.getElement());
    org.freedesktop.gstreamer.Pipeline.linkMany(bin, vc.getElement());
    pipe.play();
    vc.setPreferredSize(new java.awt.Dimension(100, 100));
    return vc;
}