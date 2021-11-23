@java.lang.Override
public void imageUpdated(java.awt.image.BufferedImage bufferedImage) {
    (counter)++;
    if (((counter) % 30) == 0) {
        droneAutoController.updateImage(bufferedImage);
    }
}