public static screenstudio.sources.SourceFFMpeg getWebcamInstance(screenstudio.sources.Webcam webcam, int fps) {
    java.lang.String input = ((" -f " + (new screenstudio.encoder.FFMpeg(null).getWebcamFormat())) + " -i ") + (webcam.getDevice());
    return new screenstudio.sources.SourceFFMpeg(webcam.getSize(), new java.awt.Rectangle(webcam.getSize()), fps, input, screenstudio.targets.Layout.SourceType.Webcam, webcam.getDevice());
}