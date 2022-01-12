public static void testImageOCR() {
    java.util.Vector<CvSeq> squares;
    final IplImage image = cvLoadImage("tmp/afine1.jpg");
    java.util.Vector<java.lang.String> numbers;
    final CanvasFrame original = new CanvasFrame("Ori");
    numbers = com.gorcer.iseeyou.Recognizer.RecognizeNumber(image);
    java.lang.System.out.println(("num:" + numbers));
    OpenCVFrameConverter converter = new OpenCVFrameConverter.ToIplImage();
    original.showImage(converter.convert(image));
    original.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
}