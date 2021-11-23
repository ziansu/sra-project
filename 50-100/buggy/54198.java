public static java.awt.image.BufferedImage ConvertBlobTobufferedImage(java.sql.Blob blob) {
    java.awt.image.BufferedImage Image = null;
    try {
        int blobLength = ((int) (blob.length()));
        byte[] blobAsBytes = blob.getBytes(1, blobLength);
        Image = javax.imageio.ImageIO.read(new java.io.ByteArrayInputStream(blobAsBytes));
    } catch (java.io.IOException | java.sql.SQLException e) {
        e.printStackTrace();
    }
    return Image;
}