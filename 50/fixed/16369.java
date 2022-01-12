@java.lang.Override
public void open(de.screenflow.frankenstein.ProcessingListener l) {
    initFrame = org.opencv.core.Mat.zeros(getHeight(), getWidth(), CvType.CV_8UC3);
}