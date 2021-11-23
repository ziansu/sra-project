public static void main(java.lang.String[] args) {
    ImageProcessing image = new ImageProcessing("X:\\Desktop\\TEST\\4.jpg", "X:\\Desktop\\TEST\\run.png");
    image.RGBtoALPHA(-16777216);
    image.OverlayImage();
    image.Save();
}