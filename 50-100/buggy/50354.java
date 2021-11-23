@java.lang.Override
void doWork(int k) throws java.lang.Exception {
    super.doWork(k);
    java.nio.file.Path imagePath = imagePaths.get(k);
    if (!(imagePath.toString().endsWith("PMC3538770_pone.0053237.g003.jpg")))
        return ;
    
    gov.nih.nlm.lhc.openi.panelseg.Mat image = org.bytedeco.javacpp.opencv_imgcodecs.imread(imagePath.toString(), org.bytedeco.javacpp.opencv_imgcodecs.CV_LOAD_IMAGE_COLOR);
    java.util.List<gov.nih.nlm.lhc.openi.panelseg.Panel> panels = gov.nih.nlm.lhc.openi.panelseg.PanelSeg.segment(image, method);
    saveSegResult(imagePath.toFile().getName(), image, panels);
}