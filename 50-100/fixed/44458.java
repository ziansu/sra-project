@java.lang.Override
public image.Image getImage(int timePoint, int channel, image.BoundingBox bounds) {
    if ((fileCT) == null) {
        synchronized(this) {
            if ((fileCT) == null)
                createFileMap();
            
        }
    }
    return image.ImageReader.openImage(fileCT.get(channel).get(timePoint), new image.ImageIOCoordinates(0, 0, 0, bounds));
}